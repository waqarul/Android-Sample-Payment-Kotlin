package com.wtmcodex.samplepaymentapp.core.di.module

import android.app.Application
import android.content.Context
import com.wtmcodex.samplepaymentapp.core.Domain
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun provideDomain(context: Context): Domain {
        return Domain.getInstance(context)
    }
}