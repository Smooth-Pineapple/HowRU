package smoothpineapple.com.howru.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import smoothpineapple.com.howru.R;

import com.yarolegovich.discretescrollview.DiscreteScrollView;

import smoothpineapple.com.howru.views.carousel.CarouselView;

public class HowAmIActivity extends AppCompatActivity {
    private static  final String CLASS_NAME = HowAmIActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DiscreteScrollView scrollView = findViewById(R.id.carousel);
        scrollView.setAdapter(new CarouselView());
    }
}
