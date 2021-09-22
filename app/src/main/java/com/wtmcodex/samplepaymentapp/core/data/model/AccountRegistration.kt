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
import java.net.URL

/**
 * Represents a customer's account (payment information for a payment method) that has been registered (i.e. stored).
 */
@Getter
@Setter
class AccountRegistration {
    /** Simple API, always present  */
    private val links: Map<String, URL>? = null

    /** Simple API, always present  */
    private val code: String? = null

    /** Simple API, always present  */
    @PaymentMethod.Definition
    private val method: String? = null

    /** Simple API, always present  */
    private val label: String? = null

    /** Simple API, always present  */
    @NetworkOperationType.Definition
    private val operationType: String? = null

    /** Simple API, always present  */
    private val maskedAccount: AccountMask? = null

    /** Indicates that this account registration is initially selected  */
    private val selected: Boolean? = null

    /** code of button-label if this network is selected  */
    private val button: String? = null

    /** An indicator that a form for this network is an empty one, without any text and input elements  */
    private val emptyForm: Boolean? = null

    /** Form input elements descriptions  */
    private val inputElements: List<InputElement>? = null

    /** contract data of first possible route.  */
    private val contractData: Map<String, String>? = null
}