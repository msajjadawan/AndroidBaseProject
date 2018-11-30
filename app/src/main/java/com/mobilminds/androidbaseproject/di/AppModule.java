package com.mobilminds.androidbaseproject.di;

import android.app.Application;
import android.content.Context;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {
    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }
    @Provides
    DateFormat providesDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    }
}