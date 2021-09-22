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
 * This class describes the different integration types
 */
object IntegrationType {
    const val MOBILE_NATIVE = "MOBILE_NATIVE"
    const val DISPLAY_NATIVE = "DISPLAY_NATIVE"
    const val SELECTIVE_NATIVE = "SELECTIVE_NATIVE"
    const val PURE_NATIVE = "PURE_NATIVE"
    const val HOSTED = "HOSTED"

    /**
     * Check if the given type is a valid integration type
     *
     * @param integrationType the integration type to validate
     * @return true when valid, false otherwise
     */
    fun isValid(integrationType: String?): Boolean {
        if (integrationType != null) {
            when (integrationType) {
                MOBILE_NATIVE, DISPLAY_NATIVE, SELECTIVE_NATIVE, PURE_NATIVE, HOSTED -> return true
            }
        }
        return false
    }

    /**
     * The interface Definition
     */
    @Retention(RetentionPolicy.SOURCE)
    @StringDef(MOBILE_NATIVE, DISPLAY_NATIVE, SELECTIVE_NATIVE, PURE_NATIVE, HOSTED)
    annotation class Definition
}