package me.loody.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by loody on 08/11/2017.
 */
public class Shoes {

    @Inject
    public Shoes() {
        Log.d("king", "shoes new instance");
    }

    public Shoes(String blood) {
        Log.d("king", blood);
    }

}
