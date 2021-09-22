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
 * This class is designed to hold advanced reference information about payment.
 */
@Getter
@Setter
class LongReference {
    /** mandatory (max 32)  */
    private val essential: String? = null

    /** optional (max 32)  */
    private val extended: String? = null

    /** optional (max 32)  */
    private val verbose: String? = null
}