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
import java.util.*

/**
 * This class is designed to hold list of applicable and registered payment network descriptions.
 */
@Getter
@Setter
class Networks
/**
 * this constructor is used for for testing
 * @param networks
 */(
    /** Simple API, always present  */
    val applicable: List<ApplicableNetwork>
) {
    /** Simple API, always present  */
    private val resourcesLastUpdate: Date? = null
}