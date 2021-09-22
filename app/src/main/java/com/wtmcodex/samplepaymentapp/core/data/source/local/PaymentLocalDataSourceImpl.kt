package com.wtmcodex.samplepaymentapp.core.data.source.local

import com.wtmcodex.samplepaymentapp.core.data.source.local.dao.PaymentDao
import com.wtmcodex.samplepaymentapp.core.data.source.local.entity.DBPayment
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class PaymentLocalDataSourceImpl @Inject constructor(private val paymentDao: PaymentDao) :
    PaymentLocalDataSource {
    override fun insertPayment(payment: DBPayment?): Completable {
        return paymentDao.insertPayment(payment)
    }

    override fun insertAll(vararg items: DBPayment): Completable {
        return paymentDao.insertAll(*items)
    }

    override val allPayments: Observable<DBPayment>
        get() = paymentDao.allPayments

    override fun getPaymentByID(id: Int): Single<DBPayment> {
        return paymentDao.getPaymentByID(id)
    }

    override fun deleteAllPayments(): Completable {
        return paymentDao.deleteAllPayments()
    }
}