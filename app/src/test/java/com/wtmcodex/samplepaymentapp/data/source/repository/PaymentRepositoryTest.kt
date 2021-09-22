package com.wtmcodex.samplepaymentapp.data.source.repository

import com.wtmcodex.samplepaymentapp.RxImmediateSchedulerRule
import com.wtmcodex.samplepaymentapp.TestUtils.fakedListResult
import com.wtmcodex.samplepaymentapp.TestUtils.fakedPaymentModel
import com.wtmcodex.samplepaymentapp.core.data.model.ListResult
import com.wtmcodex.samplepaymentapp.core.data.model.PaymentModel
import com.wtmcodex.samplepaymentapp.core.data.source.local.PaymentLocalDataSource
import com.wtmcodex.samplepaymentapp.core.data.source.remote.PaymentRemoteDataSource
import com.wtmcodex.samplepaymentapp.core.data.source.repository.PaymentRepositoryImpl
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.observers.TestObserver
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnit

class PaymentRepositoryTest {
    @get:Rule
    public var rule = MockitoJUnit.rule()

    @get:Rule
    public var testSchedulerRule = RxImmediateSchedulerRule()

    @Mock
    var remoteDataSource: PaymentRemoteDataSource? = null

    @Mock
    var localDataSource: PaymentLocalDataSource? = null
    var systemUnderTest: PaymentRepositoryImpl? = null

    @Before
    fun setUp() {
        systemUnderTest = PaymentRepositoryImpl(localDataSource!!, remoteDataSource!!)
    }

    @Test
    fun testRemoteResponseWithSuccess() {
        val responseFakedPaymentModelList: List<PaymentModel> = fakedPaymentModel
        val responseFakedResultList: ListResult? = fakedListResult
        Mockito.`when`(remoteDataSource!!.getPayments())
            .thenReturn(Observable.just(responseFakedResultList))
        val result = systemUnderTest!!.getAllPayments()
        val testObserver = TestObserver<List<PaymentModel?>?>()
        result.subscribe(testObserver)
        testObserver.assertComplete()
        testObserver.assertNoErrors()
        testObserver.assertValueCount(1)
        Assert.assertNotNull(testObserver.values())
        Assert.assertEquals(testObserver.values().size.toLong(), 1)
        val listResult = testObserver.values()[0]
        Assert.assertEquals(listResult!!.size.toLong(), 1)
        Assert.assertEquals(responseFakedPaymentModelList.size.toLong(), 1)
        Assert.assertEquals(listResult.size.toLong(), responseFakedPaymentModelList.size.toLong())
        val responseFakedPaymentModel = responseFakedPaymentModelList[0]
        val paymentModel = listResult[0]
        Assert.assertNotNull(paymentModel)
        Assert.assertEquals(paymentModel!!.paymentName, responseFakedPaymentModel.paymentName)
        Assert.assertEquals(paymentModel.paymentCode, responseFakedPaymentModel.paymentCode)
        Assert.assertEquals(paymentModel.paymentMethod, responseFakedPaymentModel.paymentMethod)
        Assert.assertNotNull(paymentModel.logoUrl)
        Assert.assertEquals(paymentModel.logoUrl, responseFakedPaymentModel.logoUrl)
    }
}