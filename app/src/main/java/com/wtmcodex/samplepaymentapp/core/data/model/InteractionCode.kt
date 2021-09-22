/*
 * Copyright (c) 2020 Payoneer Germany GmbH
 * https://www.payoneer.com
 *
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more information.
 */
package com.wtmcodex.samplepaymentapp.core.data.model

import androidx.annotation.StringDef
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * This class contains the interaction codes of a result.
 */
object InteractionCode {
    const val PROCEED = "PROCEED"
    const val ABORT = "ABORT"
    const val TRY_OTHER_NETWORK = "TRY_OTHER_NETWORK"
    const val TRY_OTHER_ACCOUNT = "TRY_OTHER_ACCOUNT"
    const val RETRY = "RETRY"
    const val RELOAD = "RELOAD"

    // client side interaction codes
    const val VERIFY = "VERIFY"

    /**
     * Check if the given type is a valid interaction code
     *
     * @param code the interaction code to validate
     * @return true when valid, false otherwise
     */
    fun isValid(code: String?): Boolean {
        if (code != null) {
            when (code) {
                PROCEED, ABORT, TRY_OTHER_NETWORK, TRY_OTHER_ACCOUNT, RETRY, RELOAD, VERIFY -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(PROCEED, ABORT, TRY_OTHER_NETWORK, TRY_OTHER_ACCOUNT, RETRY, RELOAD, VERIFY)
    annotation class Definition
}