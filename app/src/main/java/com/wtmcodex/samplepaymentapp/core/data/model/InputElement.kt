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
 * Form input element description.
 */
@Getter
@Setter
class InputElement {
    /** name  */
    private val name: String? = null

    /** type  */
    private val type: String? = null

    /** options  */
    private val options: List<SelectOption>? = null
}