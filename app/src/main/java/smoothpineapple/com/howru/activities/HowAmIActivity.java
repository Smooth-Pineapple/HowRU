package smoothpineapple.com.howru.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yarolegovich.discretescrollview.DiscreteScrollView;
import com.yarolegovich.discretescrollview.InfiniteScrollAdapter;

import java.util.Arrays;
import java.util.List;

import smoothpineapple.com.howru.R;
import smoothpineapple.com.howru.views.carousel.CarouselItem;
import smoothpineapple.com.howru.views.carousel.CarouselView;

public class HowAmIActivity extends AppCompatActivity{
    private static  final String CLASS_NAME = HowAmIActivity.class.getSimpleName();

    InfiniteScrollAdapter infiniteScrollAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CarouselItem> items = Arrays.asList(
                new CarouselItem(1, "Happy", R.drawable.img),
                new CarouselItem(2, "Sad", R.drawable.img),
                new CarouselItem(3, "Angry", R.drawable.img));

        DiscreteScrollView scrollView = findViewById(R.id.carousel);
        infiniteScrollAdapter = InfiniteScrollAdapter.wrap(new CarouselView(getApplicationContext(), items));

        scrollView.setAdapter(infiniteScrollAdapter);
    }
}
