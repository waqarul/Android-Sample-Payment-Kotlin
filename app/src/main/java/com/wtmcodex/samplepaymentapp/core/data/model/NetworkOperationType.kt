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
 * This class describes the different operation types
 */
object NetworkOperationType {
    const val CHARGE = "CHARGE"
    const val PRESET = "PRESET"
    const val PAYOUT = "PAYOUT"
    const val UPDATE = "UPDATE"
    const val ACTIVATION = "ACTIVATION"

    /**
     * Check if the given type is a valid operation type
     *
     * @param operationType the operation type to validate
     * @return true when valid, false otherwise
     */
    fun isValid(operationType: String?): Boolean {
        if (operationType != null) {
            when (operationType) {
                CHARGE, PRESET, PAYOUT, UPDATE, ACTIVATION -> return true
            }
        }
        return false
    }

    /**
     * The interface Definition
     */
    @Retention(RetentionPolicy.SOURCE)
    @StringDef(CHARGE, PRESET, PAYOUT, UPDATE, ACTIVATION)
    annotation class Definition
}