package com.wtmcodex.samplepaymentapp.core.data.source.local

import com.wtmcodex.samplepaymentapp.core.data.source.local.entity.DBPayment
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

interface PaymentLocalDataSource {
    fun insertAll(vararg items: DBPayment): Completable?
    fun insertPayment(payment: DBPayment?): Completable?
    val allPayments: Observable<DBPayment>
    fun getPaymentByID(id: Int): Single<DBPayment>
    fun deleteAllPayments(): Completable?
}