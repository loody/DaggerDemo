package me.loody.daggerdemo.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by loody on 08/11/2017.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface LanShoes {

}
