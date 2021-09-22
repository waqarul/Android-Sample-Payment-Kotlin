package com.wtmcodex.samplepaymentapp.core

import android.annotation.SuppressLint
import android.content.Context
import java.lang.NullPointerException


class Domain private constructor(val context: Context) {

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var INSTANCE: Domain? = null
        fun getInstance(context: Context): Domain {
            if (INSTANCE == null) {
                INSTANCE = Domain(context)
            }
            return INSTANCE!!
        }

        val instance: Domain
            get() = INSTANCE
                ?: throw NullPointerException("Did you forget calling getInstance with application context at the start of the app?")
    }
}
