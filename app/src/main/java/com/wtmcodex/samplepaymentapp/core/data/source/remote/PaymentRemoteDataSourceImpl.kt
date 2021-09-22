package com.wtmcodex.samplepaymentapp.core.data.source.remote

import com.wtmcodex.samplepaymentapp.core.data.model.ListResult
import com.wtmcodex.samplepaymentapp.core.data.source.remote.retrofit.PaymentApiService
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class PaymentRemoteDataSourceImpl @Inject constructor(private val apiService: PaymentApiService) :
    PaymentRemoteDataSource {
    override fun getPayments(): Observable<ListResult> = apiService.getPayments()
}