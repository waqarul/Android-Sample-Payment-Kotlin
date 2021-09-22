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
 * Payment amount data.
 */
@Getter
@Setter
class PaymentAmount {
    /** amount  */
    private val amount: BigDecimal? = null

    /** currency  */
    private val currency: String? = null
}