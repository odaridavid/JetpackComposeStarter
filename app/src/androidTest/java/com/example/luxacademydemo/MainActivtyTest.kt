package com.example.luxacademydemo

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.luxacademydemo.ui.theme.LuxAcademyDemoTheme
import org.junit.Rule
import org.junit.Test

class MainActivtyTest {
    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun testUI() {
        composeTestRule.setContent {
            LuxAcademyDemoTheme {
                ListScreen()
            }
        }

        composeTestRule.onNodeWithText("Hello").assertIsDisplayed()
        composeTestRule.onNodeWithText("Hello").performClick()


        composeTestRule.onNodeWithText("Hello").performTextInput("test")
        composeTestRule.onNodeWithText("Hello").assertTextContains("test")

    }
}