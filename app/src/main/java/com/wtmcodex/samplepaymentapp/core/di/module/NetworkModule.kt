package com.wtmcodex.samplepaymentapp.core.di.module

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.wtmcodex.samplepaymentapp.BuildConfig
import com.wtmcodex.samplepaymentapp.constants.APIConstants
import com.wtmcodex.samplepaymentapp.core.data.source.remote.retrofit.PaymentApiService
import dagger.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().setLenient().create()
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient().newBuilder()
            .readTimeout(APIConstants.READ_TIME_OUT_DELAY, TimeUnit.SECONDS)
            .connectTimeout(APIConstants.CONNECT_TIME_OUT_DELAY, TimeUnit.SECONDS)
            .addInterceptor(interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)).build()
    }

    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        var level: HttpLoggingInterceptor.Level = HttpLoggingInterceptor.Level.NONE
        if (BuildConfig.DEBUG) {
            level = HttpLoggingInterceptor.Level.BODY
        }
        return HttpLoggingInterceptor().setLevel(level)
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(
        client: OkHttpClient?,
        context: Context?
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(APIConstants.Companion.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideInstantPaymentApiService(retrofit: Retrofit): PaymentApiService {
        return retrofit.create(PaymentApiService::class.java)
    }
}