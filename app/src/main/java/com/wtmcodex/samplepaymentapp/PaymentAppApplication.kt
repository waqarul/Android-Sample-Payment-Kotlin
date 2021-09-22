package com.wtmcodex.samplepaymentapp

import android.app.Application
import dagger.android.HasAndroidInjector
import javax.inject.Inject
import dagger.android.DispatchingAndroidInjector
import com.wtmcodex.samplepaymentapp.core.di.AppInjector
import dagger.android.AndroidInjector

class PaymentAppApplication : Application(), HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>
    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}