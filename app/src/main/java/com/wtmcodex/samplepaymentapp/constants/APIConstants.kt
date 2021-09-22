package com.wtmcodex.samplepaymentapp.constants

import com.wtmcodex.samplepaymentapp.R
import com.wtmcodex.samplepaymentapp.core.Domain

interface APIConstants {
    companion object {
        val BASE_API_URL: String = Domain.instance.context.getString(R.string.base_url)
        val PATH: String = Domain.instance.context.getString(R.string.path)
        val BASE_URL = String.format("%s/%s/", BASE_API_URL, PATH)
        const val GET_PAYMENTS = "listresult.json"
        const val READ_TIME_OUT_DELAY = 2L
        const val CONNECT_TIME_OUT_DELAY = 2L
    }
}