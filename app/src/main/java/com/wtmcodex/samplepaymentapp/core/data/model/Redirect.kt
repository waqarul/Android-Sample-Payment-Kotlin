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
 * This class is designed to hold information to redirect customers browser as a result of operation execution.
 */
@Getter
@Setter
class Redirect {
    /** Simple API, always present  */
    private val url: URL? = null

    /** Simple API, always present  */
    @HttpMethod.Definition
    private val method: String? = null

    /** Simple API, optional  */
    private val parameters: List<Parameter>? = null

    /** Simple API, optional  */
    private val suppressIFrame: Boolean? = null

    /** Simple API, always present in new transactions  */
    private val type: String? = null
}