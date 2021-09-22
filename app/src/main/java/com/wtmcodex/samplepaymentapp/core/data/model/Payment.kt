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

/**
 * This class is designed to hold payment information.
 */
@Getter
@Setter
class Payment {
    /** mandatory  */
    private val reference: String? = null

    /** mandatory  */
    private val amount: BigDecimal? = null

    /** mandatory  */
    private val currency: String? = null

    /** optional (max 128)  */
    private val invoiceId: String? = null

    /** optional  */
    private val longReference: LongReference? = null
}