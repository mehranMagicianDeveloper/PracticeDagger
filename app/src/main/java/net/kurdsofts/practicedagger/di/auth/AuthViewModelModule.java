package net.kurdsofts.practicedagger.di.auth;

import androidx.lifecycle.ViewModel;

import net.kurdsofts.practicedagger.di.ViewModelKey;
import net.kurdsofts.practicedagger.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);

}
