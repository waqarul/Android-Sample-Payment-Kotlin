package com.wtmcodex.samplepaymentapp

import com.google.common.collect.Lists
import com.wtmcodex.samplepaymentapp.core.data.model.ApplicableNetwork
import com.wtmcodex.samplepaymentapp.core.data.model.ListResult
import com.wtmcodex.samplepaymentapp.core.data.model.Networks
import com.wtmcodex.samplepaymentapp.core.data.model.PaymentModel
import java.net.MalformedURLException
import java.net.URL
import java.util.HashMap

object TestUtils {
    @JvmStatic
    val fakedListResult: ListResult?
        get() = try {
            val hashMap = HashMap<String, URL>()
            hashMap["logo"] =
                URL("https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/amex.png")
            val applicableNetwork =
                ApplicableNetwork("AMEX", "American Express", "CREDIT_CARD", hashMap)
            val networks = Networks(Lists.newArrayList(applicableNetwork))
            ListResult(networks)
        } catch (ex: MalformedURLException) {
            null
        }
    @JvmStatic
    val fakedPaymentModel: List<PaymentModel>
        get() = Lists.newArrayList(
            PaymentModel(
                "American Express",
                "AMEX",
                "CREDIT_CARD",
                "https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/amex.png"
            )
        )
}