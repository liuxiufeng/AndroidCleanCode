package com.shadow.cleancode.retrofit;

import com.shadow.cleancode.retrofit.Clients.ShadowClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lxf on 2017/7/4.
 */

@Module
public class ClientModule {

    @Provides
    public static ShadowClient provideShadowClient() {
        return (ShadowClient) ClientFactory.getInstance().build("http://192.168.1.250:8080", ShadowClient.class);
    }
}
