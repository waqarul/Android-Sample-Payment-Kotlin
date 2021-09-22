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
 * This class is designed to hold information about applicable payment network.
 */
@Getter
@Setter
class ApplicableNetwork
/**
 * this constructor is used for for testing
 * @param networks
 */(
    /** Simple API, always present  */
    val code: String,
    /** Simple API, always present  */
    val label: String,
    /** Simple API, always present  */
    @field:PaymentMethod.Definition val method: String,
    /** Simple API, always present  */
    val links: Map<String, URL>
) {
    /** Simple API, always present  */
    private val grouping: String? = null

    /** Simple API, always present  */
    @NetworkOperationType.Definition
    private val operationType: String? = null

    /** Simple API, always present  */
    @RegistrationType.Definition
    private val registration: String? = null

    /** Simple API, always present  */
    @RegistrationType.Definition
    private val recurrence: String? = null

    /** Simple API, always present  */
    private val redirect: Boolean? = null

    /** code of button-label if this network is selected  */
    private val button: String? = null

    /** flag that network is initially selected  */
    private val selected: Boolean? = null

    /** form data to pre-fill a form  */
    private val formData: FormData? = null

    /** An indicator that a form for this network is an empty one, without any text and input elements  */
    private val emptyForm: Boolean? = null

    /** Form elements descriptions  */
    private val inputElements: List<InputElement>? = null

    /** contract data of first possible route.  */
    private val contractData: Map<String, String>? = null
}