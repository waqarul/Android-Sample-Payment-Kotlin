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
 * This class describes the interaction reason of a result.
 */
object InteractionReason {
    const val OK = "OK"
    const val PENDING = "PENDING"
    const val STRONG_AUTHENTICATION = "STRONG_AUTHENTICATION"
    const val DECLINED = "DECLINED"
    const val EXCEEDS_LIMIT = "EXCEEDS_LIMIT"
    const val TEMPORARY_FAILURE = "TEMPORARY_FAILURE"
    const val NETWORK_FAILURE = "NETWORK_FAILURE"
    const val BLACKLISTED = "BLACKLISTED"
    const val BLOCKED = "BLOCKED"
    const val SYSTEM_FAILURE = "SYSTEM_FAILURE"
    const val INVALID_ACCOUNT = "INVALID_ACCOUNT"
    const val FRAUD = "FRAUD"
    const val ADDITIONAL_NETWORKS = "ADDITIONAL_NETWORKS"
    const val INVALID_REQUEST = "INVALID_REQUEST"
    const val SCHEDULED = "SCHEDULED"
    const val NO_NETWORKS = "NO_NETWORKS"
    const val DUPLICATE_OPERATION = "DUPLICATE_OPERATION"
    const val CHARGEBACK = "CHARGEBACK"
    const val RISK_DETECTED = "RISK_DETECTED"
    const val CUSTOMER_ABORT = "CUSTOMER_ABORT"
    const val EXPIRED_SESSION = "EXPIRED_SESSION"
    const val EXPIRED_ACCOUNT = "EXPIRED_ACCOUNT"
    const val ACCOUNT_NOT_ACTIVATED = "ACCOUNT_NOT_ACTIVATED"
    const val TRUSTED_CUSTOMER = "TRUSTED_CUSTOMER"
    const val UNKNOWN_CUSTOMER = "UNKNOWN_CUSTOMER"
    const val ACTIVATED = "ACTIVATED"
    const val UPDATED = "UPDATED"
    const val TAKE_ACTION = "TAKE_ACTION"

    // client side interaction reasons
    const val COMMUNICATION_FAILURE = "COMMUNICATION_FAILURE"
    const val CLIENTSIDE_ERROR = "CLIENTSIDE_ERROR"

    /**
     * Check if the given reason is a valid interaction reason
     *
     * @param reason the interaction reason to validate
     * @return true when valid, false otherwise
     */
    fun isValid(reason: String?): Boolean {
        if (reason != null) {
            when (reason) {
                OK, PENDING, STRONG_AUTHENTICATION, DECLINED, EXCEEDS_LIMIT, TEMPORARY_FAILURE, NETWORK_FAILURE, BLACKLISTED, BLOCKED, SYSTEM_FAILURE, INVALID_ACCOUNT, FRAUD, ADDITIONAL_NETWORKS, INVALID_REQUEST, SCHEDULED, NO_NETWORKS, DUPLICATE_OPERATION, CHARGEBACK, RISK_DETECTED, CUSTOMER_ABORT, EXPIRED_SESSION, EXPIRED_ACCOUNT, ACCOUNT_NOT_ACTIVATED, TRUSTED_CUSTOMER, UNKNOWN_CUSTOMER, ACTIVATED, UPDATED, TAKE_ACTION, COMMUNICATION_FAILURE, CLIENTSIDE_ERROR -> return true
            }
        }
        return false
    }

    @Retention(RetentionPolicy.SOURCE)
    @StringDef(
        OK,
        PENDING,
        STRONG_AUTHENTICATION,
        DECLINED,
        EXCEEDS_LIMIT,
        TEMPORARY_FAILURE,
        NETWORK_FAILURE,
        BLACKLISTED,
        BLOCKED,
        SYSTEM_FAILURE,
        INVALID_ACCOUNT,
        FRAUD,
        ADDITIONAL_NETWORKS,
        INVALID_REQUEST,
        SCHEDULED,
        NO_NETWORKS,
        DUPLICATE_OPERATION,
        CHARGEBACK,
        RISK_DETECTED,
        CUSTOMER_ABORT,
        EXPIRED_SESSION,
        EXPIRED_ACCOUNT,
        ACCOUNT_NOT_ACTIVATED,
        TRUSTED_CUSTOMER,
        UNKNOWN_CUSTOMER,
        ACTIVATED,
        UPDATED,
        TAKE_ACTION,
        COMMUNICATION_FAILURE,
        CLIENTSIDE_ERROR
    )
    annotation class Definition
}