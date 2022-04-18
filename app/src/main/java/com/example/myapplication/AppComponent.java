package com.example.myapplication;

import com.example.myapplication.lib2.Longs;
import com.example.myapplication.lib2.b.Ints;

@javax.inject.Singleton
@dagger.Component(modules = {AppComponent.Module.class})
public interface AppComponent extends MergedSingletonComponent {

    Ints ints();
    Longs longs();

    @dagger.Component.Factory
    interface Factory {
        AppComponent create();
    }

    @dagger.Module(includes = {MergedSingletonModule.class})
    abstract class Module {
    }
}