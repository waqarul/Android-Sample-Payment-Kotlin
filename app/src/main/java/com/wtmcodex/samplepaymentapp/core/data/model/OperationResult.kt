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
 * This class is designed to hold information about operation result.
 */
@Getter
@Setter
class OperationResult {
    /** PCI API, optional  */
    private val links: Map<String, URL>? = null

    /** PCI API, always present  */
    private val resultInfo: String? = null

    /** PCI API, optional, always present in response to action (POST, UPDATE)  */
    private val interaction: Interaction? = null

    /** PCI API, optional  */
    private val redirect: Redirect? = null

    /** Provider response parameters.  */
    private val providerResponse: ProviderParameters? = null
}