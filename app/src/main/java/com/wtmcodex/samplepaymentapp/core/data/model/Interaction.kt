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
 * This class is designed to hold interaction information providing a recommendation on how to proceed.
 */
@Getter
@Setter
class Interaction {
    /** Simple API, always present  */
    @InteractionCode.Definition
    private var code: String? = null

    /** Simple API, always present  */
    @InteractionReason.Definition
    private var reason: String? = null

    /**
     * Construct an empty Interaction Object
     */
    constructor() {}

    /**
     * Construct a new Interaction Object with the predefined code and reason
     *
     * @param code the code to set.
     * @param reason the reason to set.
     */
    constructor(
        @InteractionCode.Definition code: String?,
        @InteractionReason.Definition reason: String?
    ) {
        this.code = code
        this.reason = reason
    }
}