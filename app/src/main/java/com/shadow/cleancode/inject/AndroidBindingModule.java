package com.shadow.cleancode.inject;

import com.shadow.cleancode.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by lxf on 2017/7/4.
 */

@Module
public abstract class AndroidBindingModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
