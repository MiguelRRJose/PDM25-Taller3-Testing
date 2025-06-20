package com.example.testeableapp

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4

@RunWith(AndroidJUnit4::class)
class TipCalculatorElementsTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun allElementsAreVisible() {
        // Verificar que el campo de monto esté visible
        composeTestRule.onNodeWithTag("billInput")
            .assertExists()
            .assertIsDisplayed()

        // Verificar que el texto del porcentaje esté visible
        composeTestRule.onNodeWithTag("tipPercentageText")
            .assertExists()
            .assertIsDisplayed()

        // Verificar que el texto de número de personas esté visible
        composeTestRule.onNodeWithTag("peopleCountText")
            .assertExists()
            .assertIsDisplayed()
    }
}
