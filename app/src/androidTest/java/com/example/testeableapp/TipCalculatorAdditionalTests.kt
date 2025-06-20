package com.example.testeableapp

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testeableapp.ui.Screens.TipCalculatorScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TipCalculatorAdditionalTestsTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    /**
     * Test 1: Verifica que al presionar el botón "+" el número de personas se incrementa correctamente.
     */
    @Test
    fun incrementButton_increasesPeopleCount() {
        composeTestRule.onNodeWithText("1").assertExists()
        composeTestRule.onNodeWithText("+").performClick()
        composeTestRule.onNodeWithText("2").assertExists()
    }


}
