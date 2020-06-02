package net.kurdsofts.practicedagger.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someString() {
        return "this is a test String";
    }

    @Provides
    static boolean getApp(Application application) {
        return application == null;
    }

}
