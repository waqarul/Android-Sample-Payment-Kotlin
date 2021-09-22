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
 * Describes a collection of provider specific parameters.
 */
@Getter
@Setter
class ProviderParameters {
    /** optional, provider code.  */
    private val providerCode: String? = null

    /** collection of parameters.  */
    private val parameters: List<Parameter>? = null
}