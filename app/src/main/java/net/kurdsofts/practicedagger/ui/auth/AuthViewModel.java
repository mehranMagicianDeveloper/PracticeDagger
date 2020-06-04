package net.kurdsofts.practicedagger.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import net.kurdsofts.practicedagger.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {
        this.authApi = authApi;
        Log.d(TAG, "AuthViewModel: it is working");

        if (this.authApi == null) {
            Log.d(TAG, "AuthViewModel: auth api is null");
        } else {
            Log.d(TAG, "AuthViewModel: auth api is not null");
        }
    }

}
