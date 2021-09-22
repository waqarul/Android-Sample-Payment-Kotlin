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
 * Form data to pre-fill network form. Not all data could be provided- it depends what data we know already and what network should been used.
 */
@Getter
@Setter
class FormData {
    /** account-related data to pre-fill a form  */
    private val account: AccountFormData? = null

    /** customer-related data to pre-fill a form  */
    private val customer: CustomerFormData? = null

    /** installments plans data  */
    private val installments: Installments? = null

    /** An URL to the data privacy consent document  */
    private val dataPrivacyConsentUrl: URL? = null
}