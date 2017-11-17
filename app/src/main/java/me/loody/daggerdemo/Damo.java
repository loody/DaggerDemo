package me.loody.daggerdemo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by loody on 08/11/2017.
 */

public class Damo {
    Shoes shoes;

    @Inject
    public Damo(Shoes shoes) {
        this.shoes = shoes;
    }

    public void kill() {
        Log.d("king", "Damo杀了一个");
    }
}
