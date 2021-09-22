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
 * This class describes HTTP methods that are valid for customer's browser redirect.
 */
object HttpMethod {
    const val GET = "GET"
    const val POST = "POST"

    /**
     * Check if the given method is a valid http method
     *
     * @param method the http method to validate
     * @return true when valid, false otherwise
     */
    fun isValid(method: String?): Boolean {
        if (method != null) {
            when (method) {
                GET, POST -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(GET, POST)
    annotation class Definition
}