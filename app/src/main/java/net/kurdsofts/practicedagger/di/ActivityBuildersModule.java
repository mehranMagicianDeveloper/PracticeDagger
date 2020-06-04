package net.kurdsofts.practicedagger.di;

import net.kurdsofts.practicedagger.di.auth.AuthModule;
import net.kurdsofts.practicedagger.di.auth.AuthViewModelModule;
import net.kurdsofts.practicedagger.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
