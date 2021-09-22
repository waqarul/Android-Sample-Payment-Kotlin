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
 * This class is designed to hold list of payment networks available for particular transaction based on provided information and result of
 * initialized payment session.
 *
 *
 * An instance of this object is returned as a result of new `Transaction` initialization, or during list status update via GET
 * method.
 */
@Getter
@Setter
class ListResult
/**
 * this constructor is used for for testing
 * @param networks
 */(
    /** Simple API, optional, always present in native LIST  */
    val networks: Networks
) {
    /** Simple API, always present  */
    private val links: Map<String, URL>? = null

    /** Simple API, always present  */
    private val resultInfo: String? = null

    /** Simple API, optional, always present in response to action (POST, UPDATE)  */
    private val interaction: Interaction? = null

    /** Simple API, optional  */
    private val accounts: List<AccountRegistration>? = null

    /** Advanced API, optional  */
    private val extraElements: ExtraElements? = null

    /** Preset account, Simple API, optional, could present only in the LIST-for-PRESET  */
    private val presetAccount: PresetAccount? = null

    /** LIST type based on operation of next referred actions, could be one of CHARGE, PRESET, PAYOUT, UPDATE.  */
    private val operationType: String? = null

    /** Indicates whether this LIST is explicitly initialized with permission or denial to delete accounts.  */
    private val allowDelete: Boolean? = null

    /** The style object passed in the transaction.  */
    private val style: Style? = null

    /** Payment information, optional  */
    private val payment: Payment? = null

    /** Collections of the products, optional  */
    private val products: List<Product>? = null

    /** Integration type used when creating the LIST session, always present  */
    private val integrationType: String? = null
}