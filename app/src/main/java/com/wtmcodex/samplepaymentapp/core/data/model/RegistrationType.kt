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
 * This class describes registration type behavior for applicable network.
 */
object RegistrationType {
    const val NONE = "NONE"
    const val OPTIONAL = "OPTIONAL"
    const val FORCED = "FORCED"
    const val OPTIONAL_PRESELECTED = "OPTIONAL_PRESELECTED"
    const val FORCED_DISPLAYED = "FORCED_DISPLAYED"

    /**
     * Check if the given type is a valid registration type
     *
     * @param type the registration type to validate
     * @return true when valid, false otherwise
     */
    fun isValid(type: String?): Boolean {
        if (type != null) {
            when (type) {
                NONE, OPTIONAL, FORCED, OPTIONAL_PRESELECTED, FORCED_DISPLAYED -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(NONE, OPTIONAL, FORCED, OPTIONAL_PRESELECTED, FORCED_DISPLAYED)
    annotation class Definition
}