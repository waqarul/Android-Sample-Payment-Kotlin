/*
 * Copyright (c) 2020 Payoneer Germany GmbH
 * https://www.payoneer.com
 *
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more information.
 */
package com.wtmcodex.samplepaymentapp.core.data.model

import lombok.Getter
import lombok.Setter
import java.util.*

/**
 * Customer data what should be used to pre-fill payment form.
 */
@Getter
@Setter
class CustomerFormData {
    /** optional  */
    private val birthday: Date? = null
}