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
import java.net.URL
import java.util.*

/**
 * This class is designed to hold product information.
 */
@Getter
@Setter
class Product {
    /** optional  */
    private val code: String? = null

    /** mandatory  */
    private val name: String? = null

    /** optional (totalAmount)  */
    private val amount: BigDecimal? = null

    /** optional  */
    private val currency: String? = null

    /** optional  */
    private val quantity: Int? = null

    /** optional  */
    private val plannedShippingDate: Date? = null

    /** optional  */
    private val productDescriptionUrl: URL? = null

    /** optional  */
    private val productImageUrl: URL? = null

    /** optional  */
    private val description: String? = null

    /** optional  */
    private val shippingAddressId: String? = null

    /** optional  */
    private val type: ProductType? = null

    /** optional  */
    private val netAmount: BigDecimal? = null

    /** optional  */
    private val taxAmount: BigDecimal? = null

    /** optional  */
    private val taxRatePercentage: BigDecimal? = null
}