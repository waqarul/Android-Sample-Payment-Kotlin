package com.wtmcodex.samplepaymentapp.core.di.module

import android.content.Context
import androidx.room.Room
import com.wtmcodex.samplepaymentapp.constants.DatabaseConstants
import com.wtmcodex.samplepaymentapp.core.data.source.local.PaymentDatabase
import com.wtmcodex.samplepaymentapp.core.data.source.local.dao.PaymentDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDatabase(context: Context): PaymentDatabase {
        return Room.databaseBuilder(
            context,
            PaymentDatabase::class.java,
            DatabaseConstants.DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun providePaymentDao(paymentDatabase: PaymentDatabase): PaymentDao {
        return paymentDatabase.paymentDao()
    }
}