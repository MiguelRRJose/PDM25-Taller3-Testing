package com.example.testeableapp

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.testeableapp.ui.Screens.TipCalculatorScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class TipCalculatorUiTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

   /* @Test
    fun tip_isRoundedWhenCheckboxChecked_changesValue() {
        // Paso 1: Ingresar monto
        composeTestRule.onNodeWithTag("billInput").performTextInput("113.21")

        // Paso 2: Validar propina sin redondear ($16.98)
        composeTestRule.waitUntilExists(
            hasText("Propina: \$16.98"),
            timeoutMillis = 10_000
        )

        // Paso 3: Activar el checkbox de redondeo
        composeTestRule.onNodeWithText("Redondear propina").performClick()

        // Paso 4: Validar que la propina se redondeó ($17.00)
        composeTestRule.waitUntilExists(
            hasText("Propina: \$17.00"),
            timeoutMillis = 20_000
        )
    } */

    /* @Test
    fun tip_sliderChangesValue_correctlyCalculates() {
        // Ingresar el monto
        composeTestRule.onNodeWithTag("billInput").performTextInput("100")


        composeTestRule.onNodeWithContentDescription("Slider de propina")
            .performTouchInput {
                swipeRight()
            }

        // Validar que el nuevo valor de propina se refleja (por ejemplo, 20%)
        composeTestRule.waitUntilExists(
            hasText("Propina: \$20.00"),
            timeoutMillis = 5000
        )
    } */




}

// Función auxiliar para esperar hasta que un nodo exista
fun ComposeTestRule.waitUntilExists(
    matcher: SemanticsMatcher,
    timeoutMillis: Long = 10_000
) {
    this.waitUntil(timeoutMillis) {
        this.onAllNodes(matcher).fetchSemanticsNodes().isNotEmpty()
    }
}
