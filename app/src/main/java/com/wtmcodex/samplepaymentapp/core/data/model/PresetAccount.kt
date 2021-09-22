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
 * An information about preset account.
 */
@Getter
@Setter
class PresetAccount {
    /** Links (Simple API, always present)  */
    private val links: Map<String, URL>? = null

    /** Network code (Simple API, always present)  */
    private val code: String? = null

    /** Simple API, always present  */
    @NetworkOperationType.Definition
    private val operationType: String? = null

    /** Masked account (Simple API, optional)  */
    private val maskedAccount: AccountMask? = null

    /** PCI API, optional  */
    private val redirect: Redirect? = null

    /** Simple API, always present  */
    @PaymentMethod.Definition
    private val method: String? = null
}