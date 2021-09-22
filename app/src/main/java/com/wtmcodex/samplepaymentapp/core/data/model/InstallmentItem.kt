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
import java.math.BigDecimal
import java.util.*

/**
 * An information about particular payment what is involved into installment payment process.
 */
@Getter
@Setter
class InstallmentItem {
    /** The amount of installment (mandatory)  */
    private val amount: BigDecimal? = null

    /** Installment/payment date  */
    private val date: Date? = null
}