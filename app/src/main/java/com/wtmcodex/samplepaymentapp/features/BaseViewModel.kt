package com.wtmcodex.samplepaymentapp.features

import androidx.lifecycle.ViewModel
import android.os.Bundle
import com.wtmcodex.samplepaymentapp.core.data.model.AlertModel
import androidx.lifecycle.MutableLiveData
import io.reactivex.rxjava3.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {
    var showAlertDialog = MutableLiveData<AlertModel>()
        protected set
    protected var disposables = CompositeDisposable()
    override fun onCleared() {
        disposables.clear()
        super.onCleared()
    }

    protected abstract fun loadData(params: Bundle?)
}