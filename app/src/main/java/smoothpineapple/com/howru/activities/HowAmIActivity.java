package smoothpineapple.com.howru.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import smoothpineapple.com.howru.R;

public class HowAmIActivity extends AppCompatActivity {
    private static  final String CLASS_NAME = HowAmIActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(CLASS_NAME, "Hello Log");
    }
}
