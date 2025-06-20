package com.example.testeableapp

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TipCalculatorExtraTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun tip_isCalculatedAutomatically_whenAmountEntered() {
        // Ingresar monto de 200
        composeTestRule.onNodeWithTag("billInput").performTextInput("200")

        // Validar que la propina calculada es 15% de 200 = $30.00
        composeTestRule.onNodeWithText("Propina: \$30.00").assertExists()
    }
}
