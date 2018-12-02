package smoothpineapple.com.howru;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.yarolegovich.discretescrollview.DiscreteScrollView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import smoothpineapple.com.howru.activities.HowAmIActivity;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class HowAmIActivity_Test {
    private ViewInteraction carousel;
    private DiscreteScrollView scrollView;
    private int iniPos;

    @Rule
    public ActivityTestRule<HowAmIActivity> activityActivityTestRule = new ActivityTestRule<>(HowAmIActivity.class);

    @Before
    public void getCarousel() {
        carousel = Espresso.onView(ViewMatchers.withId(R.id.carousel));
        scrollView = activityActivityTestRule.getActivity().findViewById(R.id.carousel);
        iniPos = scrollView.getCurrentItem();
    }

    @Test
    public void testSwipeRight() {
        carousel.perform(ViewActions.swipeRight());
        int ltrPos = scrollView.getCurrentItem();

        // Going lower
        assertTrue(iniPos > ltrPos);
    }

    @Test
    public void testSwipeLeft() {
        carousel.perform(ViewActions.swipeLeft());
        int ltrPos = scrollView.getCurrentItem();

        // Going higher
        assertTrue(iniPos < ltrPos);
    }
}
