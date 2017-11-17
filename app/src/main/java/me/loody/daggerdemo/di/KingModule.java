package me.loody.daggerdemo.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.loody.daggerdemo.Daji;
import me.loody.daggerdemo.Houzi;
import me.loody.daggerdemo.Shoes;

/**
 * Created by loody on 08/11/2017.
 */
@Module
public class KingModule {

    @Provides
    Shoes providesShoes() {
        return new Shoes("xx");
    }


//
    @Provides
    @BloodShoes
    Shoes providesBloodShoes() {
        return new Shoes("回血");
    }


    @Provides
    @LanShoes
    Shoes providesLanShoes() {
        return new Shoes("回蓝");
    }
//
    @Provides
    Houzi providesHouzi() {
        return new Houzi();
    }


    @Provides
//    @PreHero
    Daji providesDaji() {
        return new Daji();
    }

}
