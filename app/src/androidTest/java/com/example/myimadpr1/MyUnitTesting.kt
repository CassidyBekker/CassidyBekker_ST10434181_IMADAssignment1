package com.example.myimadpr1

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyUnitTesting {

    @Test
    fun testClearButton() {
        // Start the activity scenario
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            // Type text into EditText
            onView(withId(R.id.edAge)).perform(typeText("25"))

            // Click the clear button
            onView(withId(R.id.button2)).perform(click())

            // Check if EditText is empty
            onView(withId(R.id.edAge)).check(matches(withText("")))

            // Check if response TextView is empty
            onView(withId(R.id.response)).check(matches(withText("")))
        }
    }

    @Test
    fun testGenerateButtonWithValidAge() {
        // Start the activity scenario
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            // Type a valid age within the range of 20-24
            onView(withId(R.id.edAge)).perform(typeText("23"))

            // Click the generate button
            onView(withId(R.id.button1GH)).perform(click())

            // Check if the response TextView displays the expected text
            onView(withId(R.id.response)).check(matches(withText("23 - Selena Quintanilla\n " +
                    "Selena was tragically shot at the age of just 23, in 1995. Selena was a legendary icon in the music industry specialising in the Tejano genre. By 1995, Selena was a superstar, managed by her beloved father. Not only was she a musician but she also started a " +
                    "clothing and jewelry line which her fans obsessed over.")))
        }
    }

    @Test
    fun testGenerateButtonWithInvalidAge() {
        // Start the activity scenario
        ActivityScenario.launch(MainActivity::class.java).use { scenario ->
            // Type an age outside the valid range
            onView(withId(R.id.edAge)).perform(typeText("15"))

            // Click the generate button
            onView(withId(R.id.button1GH)).perform(click())

            // Check if the response TextView displays the error message
            onView(withId(R.id.response)).check(matches(withText("Please enter a valid age within the range of 20yrs - 100yrs.")))
        }
    }
}
