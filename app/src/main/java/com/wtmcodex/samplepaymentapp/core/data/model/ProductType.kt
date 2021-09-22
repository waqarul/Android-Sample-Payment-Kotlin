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
 * A type of the product.
 */
object ProductType {
    const val PHYSICAL = "PHYSICAL"
    const val DIGITAL = "DIGITAL"
    const val SERVICE = "SERVICE"
    const val TAX = "TAX"
    const val OTHER = "OTHER"

    /**
     * Check if the given type is a valid product type
     *
     * @param productType the product type to validate
     * @return true when valid, false otherwise
     */
    fun isValid(productType: String?): Boolean {
        if (productType != null) {
            when (productType) {
                PHYSICAL, DIGITAL, SERVICE, TAX, OTHER -> return true
            }
        }
        return false
    }

    /**
     * The interface Definition
     */
    @Retention(RetentionPolicy.SOURCE)
    @StringDef(PHYSICAL, DIGITAL, SERVICE, TAX, OTHER)
    annotation class Definition
}