package com.wtmcodex.samplepaymentapp.features.home

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import com.wtmcodex.samplepaymentapp.core.Domain
import com.wtmcodex.samplepaymentapp.core.data.model.PaymentModel
import com.wtmcodex.samplepaymentapp.core.data.source.repository.PaymentRepository
import com.wtmcodex.samplepaymentapp.core.di.scope.IOScheduler
import com.wtmcodex.samplepaymentapp.core.di.scope.UIScheduler
import com.wtmcodex.samplepaymentapp.features.BaseViewModel
import com.wtmcodex.samplepaymentapp.helpers.AlertMessagesHelper
import com.wtmcodex.samplepaymentapp.helpers.Utils
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.observers.DisposableObserver
import java.util.stream.Collectors
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val domain: Domain,
    private val paymentRepository: PaymentRepository,
    @field:IOScheduler @param:IOScheduler private val ioScheduler: Scheduler,
    @field:UIScheduler @param:UIScheduler private val uiScheduler: Scheduler
) : BaseViewModel() {
    val isLoading = MutableLiveData<Boolean?>()
    val isRecordFound = MutableLiveData<Boolean?>()
    val showRefreshIndicator = MutableLiveData<Boolean?>()
    val viewItems = MutableLiveData<List<PaymentViewItem>>()
    public override fun loadData(params: Bundle?) {
        makeRequestToFetchPaymentMethods(true)
    }

    fun makeRequestToFetchPaymentMethods(showLoading: Boolean) {
        makeRequest(showLoading)
    }

    private fun makeRequest(showLoading: Boolean) {
        if (!Utils.isNetworkAvailable(domain.context)) {
            showAlertDialog.postValue(
                AlertMessagesHelper.getNoInternetConnectionAlertModel(
                    domain.context,
                    null
                )
            )
            resetView()
            return
        }
        if (showLoading) {
            isLoading.postValue(true)
        }
        disposables.add(
            paymentRepository.getAllPayments()
                .subscribeOn(ioScheduler)
                .observeOn(uiScheduler)
                .subscribeWith(object : DisposableObserver<List<PaymentModel>>() {
                    override fun onNext(paymentModels: List<PaymentModel>) {
                        viewItems.postValue(getPaymentViewItems(paymentModels))
                        isRecordFound.postValue(true)
                    }

                    override fun onError(e: Throwable) {
                        resetView()
                        showAlertDialog.postValue(
                            AlertMessagesHelper.getAlertMessageFromException(
                                domain.context,
                                e,
                                null
                            )
                        )
                    }

                    override fun onComplete() {
                        isLoading.postValue(false)
                        showRefreshIndicator.postValue(false)
                    }
                })
        )
    }

    private fun resetView() {
        isLoading.postValue(false)
        isRecordFound.postValue(false)
        showRefreshIndicator.postValue(false)
    }

    private fun getPaymentViewItems(paymentModelList: List<PaymentModel>): List<PaymentViewItem> {
        return paymentModelList.stream().map { paymentModel: PaymentModel ->
            PaymentViewItem(
                paymentModel.paymentName,
                paymentModel.logoUrl
            )
        }.collect(Collectors.toList())
    }
}