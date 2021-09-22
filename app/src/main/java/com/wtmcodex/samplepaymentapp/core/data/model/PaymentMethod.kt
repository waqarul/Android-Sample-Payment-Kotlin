/*
 * Copyright (c) 2020 Payoneer Germany GmbH
 * https://www.payoneer.com
 *
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more information.
 */
package com.wtmcodex.samplepaymentapp.core.data.model

import androidx.annotation.StringDef
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * This class describes the payment methods
 */
object PaymentMethod {
    const val BANK_TRANSFER = "BANK_TRANSFER"
    const val BILLING_PROVIDER = "BILLING_PROVIDER"
    const val CASH_ON_DELIVERY = "CASH_ON_DELIVERY"
    const val CHECK_PAYMENT = "CHECK_PAYMENT"
    const val CREDIT_CARD = "CREDIT_CARD"
    const val DEBIT_CARD = "DEBIT_CARD"
    const val DIRECT_DEBIT = "DIRECT_DEBIT"
    const val ELECTRONIC_INVOICE = "ELECTRONIC_INVOICE"
    const val GIFT_CARD = "GIFT_CARD"
    const val MOBILE_PAYMENT = "MOBILE_PAYMENT"
    const val ONLINE_BANK_TRANSFER = "ONLINE_BANK_TRANSFER"
    const val OPEN_INVOICE = "OPEN_INVOICE"
    const val PREPAID_CARD = "PREPAID_CARD"
    const val TERMINAL = "TERMINAL"
    const val WALLET = "WALLET"

    /**
     * Check if the given method is a valid payment method
     *
     * @param method the payment method to validate
     * @return true when valid, false otherwise
     */
    fun isValid(method: String?): Boolean {
        if (method != null) {
            when (method) {
                BANK_TRANSFER, BILLING_PROVIDER, CASH_ON_DELIVERY, CHECK_PAYMENT, CREDIT_CARD, DEBIT_CARD, DIRECT_DEBIT, ELECTRONIC_INVOICE, GIFT_CARD, MOBILE_PAYMENT, ONLINE_BANK_TRANSFER, OPEN_INVOICE, PREPAID_CARD, TERMINAL, WALLET -> return true
            }
        }
        return false
    }

    /**
     * The interface Definition
     */
    @Retention(RetentionPolicy.SOURCE)
    @StringDef(
        BANK_TRANSFER,
        BILLING_PROVIDER,
        CASH_ON_DELIVERY,
        CHECK_PAYMENT,
        CREDIT_CARD,
        DEBIT_CARD,
        DIRECT_DEBIT,
        ELECTRONIC_INVOICE,
        GIFT_CARD,
        MOBILE_PAYMENT,
        ONLINE_BANK_TRANSFER,
        OPEN_INVOICE,
        PREPAID_CARD,
        TERMINAL,
        WALLET
    )
    annotation class Definition
}