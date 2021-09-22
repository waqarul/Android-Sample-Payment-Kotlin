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
import lombok.ToString

/**
 * This class is designed to hold information checkbox element that is displayed on payment page.
 */
@Getter
@Setter
@ToString
class Checkbox {
    /** Defines the mode of this Checkbox, required  */
    @CheckboxMode.Definition
    private val mode: String? = null

    /** Error message that should be displayed if required checkbox is not checked by customer.  */
    private val requiredMessage: String? = null
}