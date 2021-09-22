package com.wtmcodex.samplepaymentapp.core.data.source.repository

import com.wtmcodex.samplepaymentapp.core.data.model.ListResult
import com.wtmcodex.samplepaymentapp.core.data.model.PaymentModel
import com.wtmcodex.samplepaymentapp.core.data.source.local.PaymentLocalDataSource
import com.wtmcodex.samplepaymentapp.core.data.source.remote.PaymentRemoteDataSource
import com.wtmcodex.samplepaymentapp.core.di.scope.IOScheduler
import com.wtmcodex.samplepaymentapp.mapper.PaymentMapperRemote
import io.reactivex.rxjava3.core.*
import io.reactivex.rxjava3.observers.DisposableObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class PaymentRepositoryImpl @Inject constructor(
    private val paymentLocalDataSource: PaymentLocalDataSource,
    private val paymentRemoteDataSource: PaymentRemoteDataSource
) : PaymentRepository {
    @kotlin.jvm.JvmField
    @Inject
    @IOScheduler
    var ioScheduler: Scheduler? = null
    override fun insertAll(vararg items: PaymentModel?): Completable {
        // TODO: Not implemented
        return Completable.create { }
    }

    override fun insertPayment(payment: PaymentModel?): Completable {
        // TODO: Not implemented
        return Completable.create { }
    }

    override fun getAllPayments(): Observable<List<PaymentModel>> {
        return Observable.create { emitter: ObservableEmitter<List<PaymentModel>> ->
            paymentRemoteDataSource.getPayments().subscribeOn(Schedulers.io())
                .subscribe(object : DisposableObserver<ListResult?>() {
                    override fun onNext(listResult: ListResult?) {
                        if (listResult?.networks?.applicable == null || listResult.networks.applicable.isEmpty()) {
                            emitter.onError(Throwable("No result found"))
                        }
                        val applicable = listResult!!.networks.applicable
                        val mapper = PaymentMapperRemote()
                        emitter.onNext(mapper.transformToDomain(applicable))
                    }

                    override fun onError(e: Throwable) {
                        emitter.onError(e)
                    }

                    override fun onComplete() {
                        emitter.onComplete()
                    }
                })
        }
    }

    override fun getPaymentByID(id: Int): Single<PaymentModel> {
        // TODO: Not implemented
        return Single.create { }
    }

    override fun deleteAllPayments(): Completable {
        // TODO: Not implemented
        return Completable.create { }
    }
}