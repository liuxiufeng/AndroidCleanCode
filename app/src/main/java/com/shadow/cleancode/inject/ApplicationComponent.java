package com.shadow.cleancode.inject;

import com.shadow.cleancode.App;
import com.shadow.cleancode.retrofit.ClientModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by lxf on 2017/7/4.
 */

@Component(
        modules = {
                AndroidBindingModule.class,
                AndroidSupportInjectionModule.class,
                ClientModule.class
        })
public interface ApplicationComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }
}
