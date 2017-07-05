package com.shadow.cleancode.main;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.shadow.cleancode.databinding.ActivityMainBinding;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * Created by lxf on 2017/7/5.
 */

public class MainModelView extends BaseObservable {

    private final String TAG = "MainModelView";

    private MainActivity activity;

    private ActivityMainBinding mBiding;

    @Inject LoginRepository repository;

    private String name;

    private String password;

    @Inject
    public MainModelView(MainActivity mainActivity) {
        activity  = mainActivity;
    }

    public void init() {


    }

    public void login() {

        if (name == null || password == null) {
            return;
        }

        repository.Login(name, password, new Observer() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                Log.d(TAG, "onSubscribe");
            }

            @Override
            public void onNext(@NonNull Object o) {
                Log.d(TAG, "onNext");
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG, "onError");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onCompete");
            }
        });
    }

    public void setBiding(ActivityMainBinding biding) {
        this.mBiding = biding;
        mBiding.setMv(this);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
