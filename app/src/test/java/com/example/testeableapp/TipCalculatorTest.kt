package com.example.testeableapp

import com.example.testeableapp.ui.Screens.calculateTip
import org.junit.Assert
import org.junit.Test

class TipCalculatorTest {

    @Test
    fun calculateTip_with37PercentAndRoundUp_returnsRoundedValue() {
        val result = calculateTip(100.0, 37, true)
        Assert.assertEquals(37.0, result, 0.01)
    }

    @Test
    fun calculateTip_withNegativeAmount_returnsZero() {
        val result = calculateTip(-100.0, 20, false)
        Assert.assertEquals(0.0, result, 0.01)
    }

    @Test
    fun calculateTotalPerPerson_withValidInputs_returnsCorrectAmount() {
        val bill = 120.0
        val tip = calculateTip(bill, 10, false) // 10% = 12.0
        val numberOfPeople = 3
        val totalPerPerson = (bill + tip) / numberOfPeople

        Assert.assertEquals(44.0, totalPerPerson, 0.01)
    }
}