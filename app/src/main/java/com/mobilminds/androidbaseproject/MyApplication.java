package com.mobilminds.androidbaseproject;

import com.mobilminds.androidbaseproject.di.AppComponent;
import com.mobilminds.androidbaseproject.di.DaggerAppComponent;

import java.text.DateFormat;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


public class MyApplication extends DaggerApplication {

    @Inject
    DateFormat dateFormat;
    @Override
    public void onCreate() {
        super.onCreate();
        dateFormat.toString();

    }


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
