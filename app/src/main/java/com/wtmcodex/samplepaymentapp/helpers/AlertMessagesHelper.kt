package com.wtmcodex.samplepaymentapp.helpers

import android.content.Context
import com.wtmcodex.samplepaymentapp.R
import com.wtmcodex.samplepaymentapp.core.data.enums.ErrorType
import com.wtmcodex.samplepaymentapp.core.data.model.AlertModel
import com.wtmcodex.samplepaymentapp.core.data.model.AlertModel.OnAlertClickListener
import retrofit2.HttpException
import java.io.IOException

object AlertMessagesHelper {
    fun getNoInternetConnectionAlertModel(
        context: Context,
        listener: OnAlertClickListener?
    ): AlertModel {
        return AlertModel(
            context.getString(R.string.title_no_internet_connection),
            context.getString(R.string.message_no_internet_connection),
            context.getString(R.string.alert_ok_label),
            null,
            listener,
            ErrorType.NO_INTERNET_CONNECTION
        )
    }

    fun getAlertMessageFromException(
        context: Context,
        exception: Throwable,
        listener: OnAlertClickListener?
    ): AlertModel {
        var errorType = ErrorType.UNKNOWN_ERROR
        var errorMessage = context.getString(R.string.message_error_in_request)
        if (exception is HttpException) {
            errorType = ErrorType.fromString(
                exception.code()
            )
            errorMessage = ErrorType.getMessageForType(errorType, context)
        } else if (exception is IOException) {
            errorType = ErrorType.UNKNOWN_ERROR
            errorMessage = exception.getLocalizedMessage()
        } else if (exception is IOException) {
            errorType = ErrorType.UNKNOWN_ERROR
            errorMessage = context.getString(R.string.message_error_in_request)
        }
        return AlertModel(
            context.getString(R.string.title_error_in_request),
            errorMessage,
            context.getString(R.string.alert_ok_label),
            null,
            listener,
            errorType
        )
    }
}