package com.csuf.cpsc411.TestApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;
import android.view.ViewGroup;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*      THIS CODE ISN'T USED BECAUSE IT'S REPLACED BY
                THE single_widget_layout file

        // 1. Create a TextView object
        TextView v = new TextView(this);

        // 2. Set view  attributes
        v.setText("This is a test string");
        v.setBackgroundColor(Color.YELLOW);
        v.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM);
        v.setPadding(50, 50, 50, 350);
        v.setTextSize(36);
        v.setTypeface(null, Typeface.BOLD);
        v.setId(R.id.test_obj_id);

        // 3. Create Layout object
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        v.setLayoutParams(lp);

        // 4. Set the content view
        setContentView(v);
        */

        setContentView(R.layout.single_widget_layout);

        TextView v = findViewById(R.id.test_obj_id);

        v.setText("The test string has been updated.");
    }
}
