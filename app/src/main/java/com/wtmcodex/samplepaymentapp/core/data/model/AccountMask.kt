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
 * This class is designed to hold account mask for registered payment network.
 */
@Getter
@Setter
class AccountMask {
    /** Simple API, always present  */
    private val displayLabel: String? = null

    /** Simple API, optional  */
    private val holderName: String? = null

    /** Simple API, optional  */
    private val number: String? = null

    /** Simple API, optional  */
    private val bankCode: String? = null

    /** Simple API, optional  */
    private val bankName: String? = null

    /** Simple API, optional  */
    private val bic: String? = null

    /** Simple API, optional  */
    private val branch: String? = null

    /** Simple API, optional  */
    private val city: String? = null

    /** Simple API, optional  */
    private val expiryMonth: Int? = null

    /** Simple API, optional  */
    private val expiryYear: Int? = null

    /** Simple API, optional  */
    private val iban: String? = null

    /** Simple API, optional  */
    private val login: String? = null
}