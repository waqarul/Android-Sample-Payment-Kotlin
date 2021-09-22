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
 * Type of possible input element
 */
object RedirectType {
    const val SUMMARY = "SUMMARY"
    const val RETURN = "RETURN"
    const val CANCEL = "CANCEL"
    const val PROVIDER = "PROVIDER"
    const val HANDLER3DS2 = "3DS2-HANDLER"

    /**
     * Check if the given type is a valid Redirect type
     *
     * @param type the redirect type to validate
     * @return true when valid, false otherwise
     */
    fun isValid(type: String?): Boolean {
        if (type != null) {
            when (type) {
                SUMMARY, RETURN, CANCEL, PROVIDER, HANDLER3DS2 -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(SUMMARY, RETURN, CANCEL, PROVIDER, HANDLER3DS2)
    annotation class Definition
}