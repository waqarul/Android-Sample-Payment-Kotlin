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
 * Customer web browser data.
 */
@Getter
@Setter
class BrowserData {
    /**
     * Java enabled flag. The ability of the cardholder browser to execute Java.
     * Value is returned from the navigator.javaEnabled property.
     */
    private val javaEnabled: Boolean? = null

    /**
     * This value represents the browser language as defined in IETF BCP47. The value is limited to 1-8 characters.
     * Value is returned from navigator.language property.
     */
    private val language: String? = null

    /**
     * Color depth. The value represents the bit depth of the color palette for displaying images, in bits per pixel.
     * Obtained from cardholder browser using the screen.colorDepth property.
     */
    private val colorDepth: Int? = null

    /** Timezone  */
    private val timezone: String? = null

    /** Browser screen height. Total height of the cardholder's screen in pixels.  */
    private val browserScreenHeight: Int? = null

    /** Browser screen width. Total width of the cardholder's screen in pixels.  */
    private val browserScreenWidth: Int? = null
}