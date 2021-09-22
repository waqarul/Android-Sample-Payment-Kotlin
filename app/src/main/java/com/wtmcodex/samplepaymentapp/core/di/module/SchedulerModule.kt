package com.wtmcodex.samplepaymentapp.core.di.module

import com.wtmcodex.samplepaymentapp.core.di.scope.ComputationScheduler
import com.wtmcodex.samplepaymentapp.core.di.scope.IOScheduler
import com.wtmcodex.samplepaymentapp.core.di.scope.UIScheduler
import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers

@Module
object SchedulerModule {
    @JvmStatic
    @Provides
    @ComputationScheduler
    fun provideComputationScheduler(): Scheduler {
        return Schedulers.computation()
    }

    @JvmStatic
    @Provides
    @IOScheduler
    fun provideIOScheduler(): Scheduler {
        return Schedulers.io()
    }

    @JvmStatic
    @Provides
    @UIScheduler
    fun provideUIScheduler(): Scheduler {
        return AndroidSchedulers.mainThread()
    }
}