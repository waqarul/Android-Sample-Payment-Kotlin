package com.wtmcodex.samplepaymentapp.core.data.source.remote.retrofit

import com.wtmcodex.samplepaymentapp.constants.APIConstants
import com.wtmcodex.samplepaymentapp.core.data.model.ListResult
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface PaymentApiService {
    @GET(APIConstants.GET_PAYMENTS)
    fun getPayments(): Observable<ListResult>
}