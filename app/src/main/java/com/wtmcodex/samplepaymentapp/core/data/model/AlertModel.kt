package com.wtmcodex.samplepaymentapp.core.data.model

import com.wtmcodex.samplepaymentapp.core.data.enums.ErrorType

class AlertModel(
    val title: String?,
    val message: String?,
    val positiveButtonTitle: String?,
    val negativeButtonTitle: String?,
    val listener: OnAlertClickListener?,
    val errorType: ErrorType?
) {

    interface OnAlertClickListener {
        fun onPositiveButtonClickAction(errorType: ErrorType?)
        fun onNegativeButtonClickAction(errorType: ErrorType?)
    }
}