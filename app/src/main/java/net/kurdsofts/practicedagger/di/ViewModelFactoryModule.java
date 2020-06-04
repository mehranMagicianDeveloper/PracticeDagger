package net.kurdsofts.practicedagger.di;

import androidx.lifecycle.ViewModelProvider;

import net.kurdsofts.practicedagger.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}
