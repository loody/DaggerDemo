package me.loody.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import me.loody.daggerdemo.di.BloodShoes;
import me.loody.daggerdemo.di.DaggerKingComponent;
import me.loody.daggerdemo.di.KingModule;
import me.loody.daggerdemo.di.LanShoes;

/**
 * Created by loody on 08/11/2017.
 */
public class MainActivity extends AppCompatActivity {

//    @Inject
//    Shoes shoes;

    @Inject
    @BloodShoes
    Shoes shoesBlood;


    @Inject
    @LanShoes
    Shoes shoesLan;


    @Inject
    Damo damo;

    @Inject
    Houzi houzi1;

    @Inject
    Houzi houzi2;

    @Inject
    Daji daji1;

    @Inject
    Daji daji2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Shoes shoes = new Shoes();
//        damo = new Damo(shoes);
//        damo.kill();


        DaggerKingComponent.builder().kingModule(new KingModule()).build().inject(this);

        damo.kill();

    }
}
