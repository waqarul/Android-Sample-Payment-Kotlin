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
object InputElementType {
    /**
     * One line of text without special restrictions (example: holder name)
     */
    const val STRING = "string"

    /**
     * Numbers 0-9 and the delimiters space and dash ('-') are allowed (example: card numbers)
     */
    const val NUMERIC = "numeric"

    /**
     * Numbers 0-9 only (example: CVC)
     */
    const val INTEGER = "integer"

    /**
     * A list of possible values is given in an additional options attribute
     */
    const val SELECT = "select"

    /**
     * Checkbox type, what allows 'true' for set and 'null' or 'false' for non-set values
     */
    const val CHECKBOX = "checkbox"

    /**
     * Check if the given type is a valid input element type
     *
     * @param type the input element type to validate
     * @return true when valid, false otherwise
     */
    fun isValid(type: String?): Boolean {
        if (type != null) {
            when (type) {
                STRING, NUMERIC, INTEGER, SELECT, CHECKBOX -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(STRING, NUMERIC, INTEGER, SELECT, CHECKBOX)
    annotation class Definition
}