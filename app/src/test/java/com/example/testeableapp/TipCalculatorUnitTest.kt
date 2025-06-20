package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test

class TipCalculatorUnitTest {

    @Test
    fun calculateTip_withoutRounding_returnsExpectedTip() {
        val amount = 100.0
        val tipPercent = 15
        val roundUp = false

        val result = calculateTip(amount, tipPercent, roundUp)

        assertEquals(15.0, result, 0.001)
    }

    @Test
    fun calculateTip_withRounding_returnsRoundedTip() {
        val amount = 113.21
        val tipPercent = 15
        val roundUp = true

        val result = calculateTip(amount, tipPercent, roundUp)

        // 113.21 * 15% = 16.9815 -> redondeado = 17.0
        assertEquals(17.0, result, 0.001)
    }
}
