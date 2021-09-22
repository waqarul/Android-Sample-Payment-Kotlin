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
 * Input data what could been submitted by payment-page form.
 */
@Getter
@Setter
class AccountInputData {
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
    private val expiryMonth: String? = null

    /** Simple API, optional  */
    private val expiryYear: String? = null

    /** Simple API, optional  */
    private val iban: String? = null

    /** Simple API, optional  */
    private val login: String? = null

    /** Simple API, optional  */
    private val optIn: Boolean? = null

    /** Simple API, optional  */
    private val password: String? = null

    /** Simple API, optional  */
    private val verificationCode: String? = null

    /** day of customer's birthday  */
    private val customerBirthDay: String? = null

    /** month of customer's birthday  */
    private val customerBirthMonth: String? = null

    /** year of customer's birthday  */
    private val customerBirthYear: String? = null

    /** id of installment plan  */
    private val installmentPlanId: String? = null
}