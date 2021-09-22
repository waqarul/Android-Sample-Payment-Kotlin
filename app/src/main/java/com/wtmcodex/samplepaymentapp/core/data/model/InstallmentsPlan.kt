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

/**
 * Payment plan to pay by schedule.
 */
@Getter
@Setter
class InstallmentsPlan {
    /** unique plan id.  */
    private val id: String? = null

    /** Collection of installment's info (mandatory)  */
    private val schedule: List<InstallmentItem>? = null

    /** An array of possible payment days (optional)  */
    private val dueDays: List<Int>? = null

    /** Currency value (mandatory)  */
    private val currency: String? = null

    /** The interest amount.  */
    private val interestAmount: BigDecimal? = null

    /** Fee for opening up an installment plan (optional)  */
    private val installmentSetupFee: BigDecimal? = null

    /** Constant periodic fee for each installment item  (optional)  */
    private val installmentPeriodicFee: BigDecimal? = null

    /**
     * The total fee for the installment payment (or serviceChargeAmount) (mandatory).
     * Includes all periodic fees and the installment set-up fee.
     */
    private val installmentFee: BigDecimal? = null

    /** The total transaction amount after calculation including all fees and interest (mandatory)  */
    private val totalAmount: BigDecimal? = null

    /** The interest rate per year in percentages (Nominalzins or Sollzins) (mandatory)  */
    private val nominalInterestRate: BigDecimal? = null

    /** The effective interest rate per year in percentages (Effektivzins) (mandatory)  */
    private val effectiveInterestRate: BigDecimal? = null

    /** An URL to the Credit Information document (optional)  */
    private val creditInformationUrl: URL? = null

    /** An URL to terms and conditions information document (optional)  */
    private val termsAndConditionsUrl: URL? = null

    /** An URL to the data privacy consent document (optional)  */
    private val dataPrivacyConsentUrl: URL? = null

    /** An URL to the installment plan logo (optional)  */
    private val logoUrl: URL? = null

    /** Description of the installments plan (optional)  */
    private val description: String? = null

    /** Number of installments in the installments plan (optional)  */
    private val numberOfInstallments: Int? = null
}