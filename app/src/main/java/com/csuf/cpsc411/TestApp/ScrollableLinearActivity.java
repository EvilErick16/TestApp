package com.csuf.cpsc411.TestApp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.ScrollView;

import androidx.annotation.Nullable;

public class ScrollableLinearActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // Call parent method
        super.onCreate(savedInstanceState);

        /*

        // Create Scroll view object
        ScrollView sv = new ScrollView(this);

        // Create Linear Layout
        LinearLayout lv = new LinearLayout(this);
        lv.setOrientation(LinearLayout.VERTICAL);


        // Add text strings to linear layout
        for (int i = 1; i <= 30; i++){
            TextView tv = new TextView(this);
            tv.setText("String" + i);
            tv.setTextSize(24);
            tv.setBackgroundColor(Color.LTGRAY);
            lv.addView(tv);
        }

        // Add linear layout into scrollview
        sv.addView(lv);

        // Display instance of scroll view
        setContentView(sv);

         */
        setContentView(R.layout.simple_linear_rf);
    }
}
