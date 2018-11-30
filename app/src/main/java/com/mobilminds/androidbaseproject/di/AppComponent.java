package com.mobilminds.androidbaseproject.di;

import android.app.Application;

import com.mobilminds.androidbaseproject.MyApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        UIComponentModule.class
//        RoomModule.class,
//        NetworkModule.class,


//        ,
//        ApiController.class,
//        DateTimePickerUtil.class

})

public interface AppComponent extends AndroidInjector<MyApplication> {
    @Override
    void inject(MyApplication myApplication);

    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);
        AppComponent build();
    }

}