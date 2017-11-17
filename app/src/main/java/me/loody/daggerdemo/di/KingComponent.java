package me.loody.daggerdemo.di;

import dagger.Component;
import me.loody.daggerdemo.MainActivity;

/**
 * Created by loody on 08/11/2017.
 */
@Component(modules = KingModule.class)
@PreHero
public interface KingComponent {
    void inject(MainActivity mainActivity);
}
