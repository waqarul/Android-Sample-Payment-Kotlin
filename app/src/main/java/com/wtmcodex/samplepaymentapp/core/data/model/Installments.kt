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

/**
 * Installments information.
 */
@Getter
@Setter
class Installments {
    /** payment amount of original payment  */
    private val originalPayment: PaymentAmount? = null

    /** installments plans  */
    private val plans: List<InstallmentsPlan>? = null
}