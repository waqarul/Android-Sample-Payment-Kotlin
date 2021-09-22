package com.wtmcodex.samplepaymentapp.constants

interface DatabaseConstants {
    companion object {
        const val DATABASE_NAME = "PaymentType.db"
        const val TABLE_PAYMENT = "Payments"
        const val QUERY_SELECT_PAYMENTS = "SELECT * FROM $TABLE_PAYMENT"
        const val QUERY_SELECT_PAYMENT_BY_ID = "SELECT * FROM $TABLE_PAYMENT WHERE id=:id "
        const val QUERY_DELETE_PAYMETS = "DELETE FROM $TABLE_PAYMENT"
    }
}