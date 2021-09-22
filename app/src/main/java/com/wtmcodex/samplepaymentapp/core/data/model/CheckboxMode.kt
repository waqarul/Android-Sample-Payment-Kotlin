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
 * This class describes possible checkbox display modes.
 */
object CheckboxMode {
    const val NONE = "NONE"
    const val OPTIONAL = "OPTIONAL"
    const val OPTIONAL_PRESELECTED = "OPTIONAL_PRESELECTED"
    const val REQUIRED = "REQUIRED"
    const val REQUIRED_PRESELECTED = "REQUIRED_PRESELECTED"
    const val FORCED = "FORCED"
    const val FORCED_DISPLAYED = "FORCED_DISPLAYED"

    /**
     * Check if the given mode is a valid checkbox mode
     *
     * @param mode the checkbox mode to validate
     * @return true when valid, false otherwise
     */
    fun isValid(mode: String?): Boolean {
        if (mode != null) {
            when (mode) {
                NONE, OPTIONAL, OPTIONAL_PRESELECTED, REQUIRED, REQUIRED_PRESELECTED, FORCED, FORCED_DISPLAYED -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(
        NONE,
        OPTIONAL,
        OPTIONAL_PRESELECTED,
        REQUIRED,
        REQUIRED_PRESELECTED,
        FORCED,
        FORCED_DISPLAYED
    )
    annotation class Definition
}