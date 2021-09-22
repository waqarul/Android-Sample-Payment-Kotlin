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
 * This class is designed to hold information for operation (CHARGE, PAYOUT, UPDATE) with selected payment network.
 */
@Getter
@Setter
class OperationData {
    /** Simple API, optional  */
    private val account: AccountInputData? = null

    /** Simple API, optional  */
    private val autoRegistration: Boolean? = null

    /** Simple API, optional  */
    private val allowRecurrence: Boolean? = null

    /** Advanced API, optional  */
    private val checkboxes: Map<String, Boolean>? = null

    /** Provider request parameters.  */
    private val providerRequest: ProviderParameters? = null

    /** Customer web browser data  */
    private val browserData: BrowserData? = null
}