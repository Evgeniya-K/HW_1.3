package ru.netology

import fee
import org.junit.Test

import org.junit.Assert.*

class Hw_1_3_2KtTest {

    @Test
    fun fee_visaMinCommission() {
        val paymentMethod = "Visa"
        val valueTransfer = 100
        val valueMonthTransfer = 50_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(35,result)
    }

    @Test
    fun fee_visaErrorValueMonthTransferCommission() {
        val paymentMethod = "Visa"
        val valueTransfer = 100
        val valueMonthTransfer = 650_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(-2,result)
    }

    @Test
    fun fee_vkPayCommission() {
        val paymentMethod = "VK Pay"
        val valueTransfer = 1000
        val valueMonthTransfer = 30_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(0,result)
    }

    @Test
    fun fee_vkPayErrorValueTransferCommission() {
        val paymentMethod = "VK Pay"
        val valueTransfer = 20_000
        val valueMonthTransfer = 30_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(-2,result)
    }

    @Test
    fun fee_MaestroCommission() {
        val paymentMethod = "Maestro"
        val valueTransfer = 20_000
        val valueMonthTransfer = 30_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(0,result)
    }

    @Test
    fun fee_MaestroAddCommission() {
        val paymentMethod = "Maestro"
        val valueTransfer = 20_000
        val valueMonthTransfer = 60_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(140,result)
    }

    @Test
    fun fee_MaestroErrorValueTransferCommission() {
        val paymentMethod = "Maestro"
        val valueTransfer = 200_000
        val valueMonthTransfer = 60_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(-8,result)
    }

    @Test
    fun fee_errorTypePaymentMethod() {
        val paymentMethod = "apple pay"
        val valueTransfer = 20_000
        val valueMonthTransfer = 60_000

        val result = fee(paymentMethod, valueTransfer, valueMonthTransfer)

        assertEquals(-1,result)
    }
}