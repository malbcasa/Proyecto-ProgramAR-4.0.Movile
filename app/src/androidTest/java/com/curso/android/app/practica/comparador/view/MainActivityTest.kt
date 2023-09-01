package com.curso.android.app.practica.comparador.view

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @get:Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {

    }

    @After
    fun tearDown() {
    }

    @Test
    fun mainActivity_updateResult(){
        Espresso.onView(
            ViewMatchers.withId(com.curso.android.app.practica.comparador.R.id.text1)
        ).perform(
            ViewActions.typeText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi non mattis est. Sed nec nunc mi. Phasellus tempor ornare tincidunt. Mauris et aliquam sem, ut euismod dui. Duis pellentesque id eros a tristique. Nulla ac odio semper, ultrices orci id, efficitur diam. Aenean gravida tellus lorem, sit amet tempor est interdum non. Duis dapibus semper consectetur. Nulla volutpat mi eget urna facilisis, ut vehicula nisi lacinia. Etiam tincidunt diam vitae dignissim dignissim. In scelerisque, lorem id vehicula placerat, nunc velit convallis quam, quis posuere elit diam eget diam. Sed vulputate hendrerit quam, at dictum nibh imperdiet at. Ut gravida felis dui, ac ultrices nibh congue ac. Nunc in sem ut odio mattis ornare. Aliquam erat volutpat.")
        )

        Espresso.onView(
            ViewMatchers.withId(com.curso.android.app.practica.comparador.R.id.text2)
        ).perform(
            ViewActions.typeText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi non mattis est. Sed nec nunc mi. Phasellus tempor ornare tincidunt. Mauris et aliquam sem, ut euismod dui. Duis pellentesque id eros a tristique. Nulla ac odio semper, ultrices orci id, efficitur diam. Aenean gravida tellus lorem, sit amet tempor est interdum non. Duis dapibus semper consectetur. Nulla volutpat mi eget urna facilisis, ut vehicula nisi lacinia. Etiam tincidunt diam vitae dignissim dignissim. In scelerisque, lorem id vehicula placerat, nunc velit convallis quam, quis posuere elit diam eget diam. Sed vulputate hendrerit quam, at dictum nibh imperdiet at. Ut gravida felis dui, ac ultrices nibh congue ac. Nunc in sem ut odio mattis ornare. Aliquam erat volutpat.")
        )

        Espresso.onView(
            ViewMatchers.withId(com.curso.android.app.practica.comparador.R.id.compare)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(com.curso.android.app.practica.comparador.R.id.resultado)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("Los textos son iguales!")
            )
        )
    }
}