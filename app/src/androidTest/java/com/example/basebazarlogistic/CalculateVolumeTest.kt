//import android.widget.Button
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.filters.LargeTest
//import androidx.test.platform.app.InstrumentationRegistry
//import androidx.test.rule.ActivityTestRule
//import com.example.basebazarlogistic.MainActivity
//import com.example.basebazarlogistic.R
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//import androidx.test.espresso.Espresso.onView
//import androidx.test.espresso.action.ViewActions.replaceText
//import androidx.test.espresso.action.ViewActions.click
//import androidx.test.espresso.assertion.ViewAssertions.matches
//import androidx.test.espresso.matcher.ViewMatchers.withId
//import androidx.test.espresso.matcher.ViewMatchers.withText
//import com.example.basebazarlogistic.ui.Buttons
//
//@RunWith(AndroidJUnit4::class)
//@LargeTest
//class CalculateVolumeTest {
//
//    @get:Rule
//    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)
//
//    @Test
//    fun testCalculateVolume() {
//        var buttons = Buttons(activityRule)
//
//        // Установка значений в EditText
//        onView(withId(R.id.lengthButton)).perform(replaceText("2"))
//        onView(withId(R.id.widthButton)).perform(replaceText("3"))
//        onView(withId(R.id.heightButton)).perform(replaceText("4"))
//
//        // Выполнение метода calculateVolume()
//        onView(withId(R.id.calculateVolumeButton)).perform(click())
//
//        // Проверка, что значение в TextView изменилось на ожидаемое
//        onView(withId(R.id.volumeText)).check(matches(withText("24.00000")))
//    }
//}
