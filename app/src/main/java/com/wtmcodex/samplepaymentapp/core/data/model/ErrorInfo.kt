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
 * This class is designed to hold information about error that happened during processing of either list or operation request.
 */
@Getter
@Setter
class ErrorInfo {
    /** Simple API, always present  */
    private var resultInfo: String? = null

    /** Simple API, always present  */
    private var interaction: Interaction? = null

    /**
     * Construct an empty ErrorInfo
     */
    constructor() {}

    /**
     * Constructs a new ErrorInfo with the resultInfo and interaction
     *
     * @param resultInfo providing a description of the error
     * @param interaction contains recommendation which steps to take next
     */
    constructor(resultInfo: String?, interaction: Interaction?) {
        this.resultInfo = resultInfo
        this.interaction = interaction
    }
}