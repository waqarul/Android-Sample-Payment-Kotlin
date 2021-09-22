package com.wtmcodex.samplepaymentapp.core.data.source.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wtmcodex.samplepaymentapp.constants.DatabaseConstants
import com.wtmcodex.samplepaymentapp.core.data.source.local.entity.DBPayment
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

@Dao
interface PaymentDao : BaseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg items: DBPayment): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPayment(payment: DBPayment?): Completable

    @get:Query(DatabaseConstants.Companion.QUERY_SELECT_PAYMENTS)
    val allPayments: Observable<DBPayment>

    @Query(DatabaseConstants.Companion.QUERY_SELECT_PAYMENT_BY_ID)
    fun getPaymentByID(id: Int): Single<DBPayment>

    @Query(DatabaseConstants.Companion.QUERY_DELETE_PAYMETS)
    fun deleteAllPayments(): Completable
}