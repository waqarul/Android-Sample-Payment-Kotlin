package com.wtmcodex.samplepaymentapp.core.data.source.repository

import com.wtmcodex.samplepaymentapp.core.data.model.PaymentModel
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

interface PaymentRepository {
    fun insertAll(vararg item: PaymentModel?): Completable
    fun insertPayment(payment: PaymentModel?): Completable
    fun getAllPayments(): Observable<List<PaymentModel>>
    fun getPaymentByID(id: Int): Single<PaymentModel>
    fun deleteAllPayments(): Completable
}