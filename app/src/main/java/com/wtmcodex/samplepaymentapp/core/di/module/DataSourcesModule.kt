package com.wtmcodex.samplepaymentapp.core.di.module

import com.wtmcodex.samplepaymentapp.core.data.source.local.PaymentLocalDataSource
import com.wtmcodex.samplepaymentapp.core.data.source.local.PaymentLocalDataSourceImpl
import com.wtmcodex.samplepaymentapp.core.data.source.remote.PaymentRemoteDataSource
import com.wtmcodex.samplepaymentapp.core.data.source.remote.PaymentRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourcesModule {
    @Binds
    abstract fun bindLocalDataSource(paymentLocalDataSourceImpl: PaymentLocalDataSourceImpl): PaymentLocalDataSource

    @Binds
    abstract fun bindRemoteDataSource(paymentRemoteDataSourceImpl: PaymentRemoteDataSourceImpl): PaymentRemoteDataSource
}