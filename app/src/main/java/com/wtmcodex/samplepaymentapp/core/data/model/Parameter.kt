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
 * This class is designed to hold information about HTTP parameter.
 */
@Getter
@Setter
class Parameter {
    /** Simple API, always present  */
    private val name: String? = null

    /** Simple API, optional  */
    private val value: String? = null
}