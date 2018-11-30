package com.mobilminds.androidbaseproject.di;

import com.mobilminds.androidbaseproject.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class UIComponentModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();
}