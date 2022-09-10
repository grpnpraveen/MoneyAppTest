package com.example.myapplication3


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class Fulltest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun fulltest() {
        val materialButton = onView(
            allOf(
                withId(R.id.show_name), withText("Show name"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton.perform(click())

        val materialButton2 = onView(
            allOf(
                withId(R.id.shownext), withText("Show next Screen"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton2.perform(click())

        val appCompatImageButton = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(androidx.appcompat.R.id.action_bar),
                        childAtPosition(
                            withId(androidx.appcompat.R.id.action_bar_container),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton.perform(click())

        val materialButton3 = onView(
            allOf(
                withId(R.id.show_name), withText("Show name"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton3.perform(click())

        val textView = onView(
            allOf(
                withId(R.id.name), withText("Gali Ravi Praveen"),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        textView.check(matches(withText("Gali Ravi Praveen")))

        val materialButton4 = onView(
            allOf(
                withId(R.id.shownext), withText("Show next Screen"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton4.perform(click())

        val textView2 = onView(
            allOf(
                withId(R.id.name2), withText("Welcome "),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        textView2.check(matches(withText("Welcome ")))

        val appCompatImageButton2 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(androidx.appcompat.R.id.action_bar),
                        childAtPosition(
                            withId(androidx.appcompat.R.id.action_bar_container),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton2.perform(click())

        val appCompatEditText = onView(
            allOf(
                withId(R.id.message),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("USER"), closeSoftKeyboard())

        val materialButton5 = onView(
            allOf(
                withId(R.id.shownext), withText("Show next Screen"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        materialButton5.perform(click())

        val textView3 = onView(
            allOf(
                withId(R.id.name2), withText("Welcome USER"),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        textView3.check(matches(withText("Welcome USER")))

        val appCompatImageButton3 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(androidx.appcompat.R.id.action_bar),
                        childAtPosition(
                            withId(androidx.appcompat.R.id.action_bar_container),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton3.perform(click())

        val materialButton6 = onView(
            allOf(
                withId(R.id.show_list_view), withText("Show List View"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    4
                ),
                isDisplayed()
            )
        )
        materialButton6.perform(click())

        val textView4 = onView(
            allOf(
                withId(android.R.id.text1), withText("Mumbai"),
                withParent(
                    allOf(
                        withId(R.id.listview),
                        withParent(IsInstanceOf.instanceOf(android.view.ViewGroup::class.java))
                    )
                ),
                isDisplayed()
            )
        )
        textView4.check(matches(withText("Mumbai")))

        val textView5 = onView(
            allOf(
                withId(android.R.id.text1), withText("jaipur"),
                withParent(
                    allOf(
                        withId(R.id.listview),
                        withParent(IsInstanceOf.instanceOf(android.view.ViewGroup::class.java))
                    )
                ),
                isDisplayed()
            )
        )
        textView5.check(matches(withText("jaipur")))

        val materialButton7 = onView(
            allOf(
                withId(R.id.showcustomlist), withText("show custom list"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton7.perform(click())

        val textView6 = onView(
            allOf(
                withId(R.id.country), withText("India"),
                withParent(withParent(withId(R.id.listviewcustom))),
                isDisplayed()
            )
        )
        textView6.check(matches(withText("India")))

        val textView7 = onView(
            allOf(
                withId(R.id.capital), withText("Rome"),
                withParent(withParent(withId(R.id.listviewcustom))),
                isDisplayed()
            )
        )
        textView7.check(matches(withText("Rome")))

        val appCompatImageButton4 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(androidx.appcompat.R.id.action_bar),
                        childAtPosition(
                            withId(androidx.appcompat.R.id.action_bar_container),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton4.perform(click())

        val materialButton8 = onView(
            allOf(
                withId(R.id.editablecustomlist), withText("Show Editable List"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton8.perform(click())

        val materialButton9 = onView(
            allOf(
                withId(R.id.additem), withText("Add"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton9.perform(click())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.edit1),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.custom),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(replaceText("INDIA"), closeSoftKeyboard())

        val appCompatEditText3 = onView(
            allOf(
                withId(R.id.edit2),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.custom),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        appCompatEditText3.perform(replaceText("DELHI"), closeSoftKeyboard())

        val materialButton10 = onView(
            allOf(
                withId(android.R.id.button1), withText("Add"),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.buttonPanel),
                        0
                    ),
                    3
                )
            )
        )
        materialButton10.perform(scrollTo(), click())

        val textView8 = onView(
            allOf(
                withId(R.id.country), withText("INDIA"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView8.check(matches(withText("INDIA")))

        val textView9 = onView(
            allOf(
                withId(R.id.capital), withText("DELHI"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView9.check(matches(withText("DELHI")))

        val materialButton11 = onView(
            allOf(
                withId(R.id.additem), withText("Add"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton11.perform(click())

        val appCompatEditText4 = onView(
            allOf(
                withId(R.id.edit1),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.custom),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText4.perform(replaceText("KOREA"), closeSoftKeyboard())

        val appCompatEditText5 = onView(
            allOf(
                withId(R.id.edit2),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.custom),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        appCompatEditText5.perform(replaceText("SEOUL"), closeSoftKeyboard())

        val materialButton12 = onView(
            allOf(
                withId(android.R.id.button1), withText("Add"),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.buttonPanel),
                        0
                    ),
                    3
                )
            )
        )
        materialButton12.perform(scrollTo(), click())

        val textView10 = onView(
            allOf(
                withId(R.id.country), withText("INDIA"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView10.check(matches(withText("INDIA")))

        val textView11 = onView(
            allOf(
                withId(R.id.country), withText("KOREA"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView11.check(matches(withText("KOREA")))

        val textView12 = onView(
            allOf(
                withId(R.id.capital), withText("SEOUL"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView12.check(matches(withText("SEOUL")))

        val materialButton13 = onView(
            allOf(
                withId(R.id.resetitem), withText("Reset"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton13.perform(click())

        val materialButton14 = onView(
            allOf(
                withId(android.R.id.button1), withText("yes"),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.buttonPanel),
                        0
                    ),
                    3
                )
            )
        )
        materialButton14.perform(scrollTo(), click())

        val listView = onView(
            allOf(
                withId(R.id.listview),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()
            )
        )
        listView.check(matches(isDisplayed()))

        val materialButton15 = onView(
            allOf(
                withId(R.id.additem), withText("Add"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        materialButton15.perform(click())

        val appCompatEditText6 = onView(
            allOf(
                withId(R.id.edit1),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.custom),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatEditText6.perform(replaceText("FUN"), closeSoftKeyboard())

        val appCompatEditText7 = onView(
            allOf(
                withId(R.id.edit2),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.custom),
                        0
                    ),
                    3
                ),
                isDisplayed()
            )
        )
        appCompatEditText7.perform(replaceText("FUN2"), closeSoftKeyboard())

        val materialButton16 = onView(
            allOf(
                withId(android.R.id.button1), withText("Add"),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.buttonPanel),
                        0
                    ),
                    3
                )
            )
        )
        materialButton16.perform(scrollTo(), click())

        val materialButton17 = onView(
            allOf(
                withId(R.id.resetitem), withText("Reset"),
                childAtPosition(
                    childAtPosition(
                        withId(android.R.id.content),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        materialButton17.perform(click())

        val materialButton18 = onView(
            allOf(
                withId(android.R.id.button2), withText("No"),
                childAtPosition(
                    childAtPosition(
                        withId(androidx.appcompat.R.id.buttonPanel),
                        0
                    ),
                    2
                )
            )
        )
        materialButton18.perform(scrollTo(), click())

        val textView13 = onView(
            allOf(
                withId(R.id.country), withText("FUN"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView13.check(matches(withText("FUN")))

        val textView14 = onView(
            allOf(
                withId(R.id.capital), withText("FUN2"),
                withParent(withParent(withId(R.id.listview))),
                isDisplayed()
            )
        )
        textView14.check(matches(withText("FUN2")))

        val appCompatImageButton5 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(androidx.appcompat.R.id.action_bar),
                        childAtPosition(
                            withId(androidx.appcompat.R.id.action_bar_container),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton5.perform(click())

        val appCompatImageButton6 = onView(
            allOf(
                withContentDescription("Navigate up"),
                childAtPosition(
                    allOf(
                        withId(androidx.appcompat.R.id.action_bar),
                        childAtPosition(
                            withId(androidx.appcompat.R.id.action_bar_container),
                            0
                        )
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatImageButton6.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
