package com.wtmcodex.samplepaymentapp.core.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.wtmcodex.samplepaymentapp.constants.DatabaseConstants

@Entity(tableName = DatabaseConstants.Companion.TABLE_PAYMENT)
class DBPayment(
    @field:ColumnInfo(name = "payment_name") val paymentName: String,
    @field:ColumnInfo(name = "logo_url") val logoUrl: String,
    @field:ColumnInfo(name = "payment_code") val paymentCode: String,
    @field:ColumnInfo(name = "payment_method") val paymentMethod: String
) {
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id = 0

}