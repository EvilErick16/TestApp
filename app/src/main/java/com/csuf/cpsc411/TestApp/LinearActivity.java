package com.csuf.cpsc411.TestApp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;

import androidx.annotation.Nullable;

public class LinearActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create root object
        LinearLayout root = new LinearLayout(this);
        root.setBackgroundColor(Color.CYAN);

        // create layout parameters fot root object
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);

        // Create Linear object
        LinearLayout llObj = new LinearLayout(this);
        llObj.setBackgroundColor(Color.LTGRAY);
        llObj.setOrientation(LinearLayout.HORIZONTAL);
        llObj.setLayoutParams(llp);

        // Make Linear parameter for widget
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0,30,0,0);
        //lp.weight = 1;

        // Create first widget
        TextView tv = new TextView(this);
        tv.setText("Sting 1");
        tv.setLayoutParams(lp);
        tv.setBackgroundColor(Color.GREEN);
        llObj.addView(tv);

        // Make linear parameter for second widget
        LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp1.setMargins(0,30,0,0);
        //lp1.gravity = Gravity.CENTER;
        //lp1.weight = 1;

        // Create second widget
        TextView tv1 = new TextView(this);
        tv1.setText("String 2");
        tv1.setLayoutParams(lp1);
        tv1.setBackgroundColor(Color.BLUE);
        llObj.addView(tv1);

        // Make linear parameter for third widget
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        lp2.setMargins(0,30,0,30);
        //lp2.gravity = Gravity.BOTTOM;
        //lp2.weight = 3;

        // make third widget
        TextView tv2 = new TextView(this);
        tv2.setText("String 3");
        tv2.setLayoutParams(lp2);
        tv2.setBackgroundColor(Color.YELLOW);
        llObj.addView(tv2);

        // Add linear object to root object
        root.addView(llObj);

        // Display root object
        setContentView(root);
    }
}
