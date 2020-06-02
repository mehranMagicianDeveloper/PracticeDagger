package net.kurdsofts.practicedagger.di;

import android.app.Application;

import net.kurdsofts.practicedagger.ActivityBuildersModule;
import net.kurdsofts.practicedagger.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application (Application application);

        AppComponent build();
    }
}
