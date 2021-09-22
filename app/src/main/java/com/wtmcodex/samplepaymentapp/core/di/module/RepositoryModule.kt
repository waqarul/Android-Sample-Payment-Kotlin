package com.wtmcodex.samplepaymentapp.core.di.module

import com.wtmcodex.samplepaymentapp.core.data.source.repository.PaymentRepository
import com.wtmcodex.samplepaymentapp.core.data.source.repository.PaymentRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {
    @Binds
    abstract fun bindPaymentRepository(paymentRepositoryImpl: PaymentRepositoryImpl): PaymentRepository
}