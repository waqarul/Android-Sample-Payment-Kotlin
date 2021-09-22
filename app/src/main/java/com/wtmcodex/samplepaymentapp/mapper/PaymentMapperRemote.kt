package com.wtmcodex.samplepaymentapp.mapper

import com.wtmcodex.samplepaymentapp.core.data.model.ApplicableNetwork
import com.wtmcodex.samplepaymentapp.core.data.model.PaymentModel
import java.util.stream.Collectors

class PaymentMapperRemote : BaseMapper<List<ApplicableNetwork>?, List<PaymentModel>> {
    override fun transformToDomain(type: List<ApplicableNetwork>?): List<PaymentModel> {
        return type!!.stream().map { applicableNetwork: ApplicableNetwork ->
            var logoUrl: String? = null
            if (applicableNetwork.links.containsKey("logo")) {
                logoUrl = applicableNetwork.links["logo"].toString()
            }
            PaymentModel(
                applicableNetwork.label,
                applicableNetwork.code,
                applicableNetwork.method,
                logoUrl
            )
        }.collect(Collectors.toList())
    }

    override fun transformToDto(type: List<PaymentModel>): List<ApplicableNetwork>? {
        return null
    }
}