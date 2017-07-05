package com.shadow.cleancode.main;

import com.shadow.cleancode.repositories.Repository;
import com.shadow.cleancode.retrofit.Clients.ShadowClient;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import io.reactivex.Observer;

/**
 * Created by lxf on 2017/7/4.
 */

public class LoginRepository extends Repository {

    @Inject
    ShadowClient client;

    @Inject
    public LoginRepository() {

    }

    public void Login(String name, String pwd, Observer observer) {
        Map params = new HashMap();
        params.put(LoginQueryHelper.QUERY_NAME, name);
        params.put(LoginQueryHelper.QUERY_PASSWORD, pwd);

       run(client.login(params), observer);
    }

}
