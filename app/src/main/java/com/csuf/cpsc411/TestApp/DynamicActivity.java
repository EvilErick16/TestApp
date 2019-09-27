package com.csuf.cpsc411.TestApp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class DynamicActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dynamic_content);

        LinearLayout llview = findViewById(R.id.dynamicLayoutId);
        llview.setBackgroundColor(Color.CYAN);

        //Inflate second layout resource file
        LayoutInflater inflater = LayoutInflater.from(this);
        TextView tv0 = (TextView) inflater.inflate(R.layout.additional_text_view,
                llview, false);
        tv0.setBackgroundColor(Color.GREEN);
        tv0.setTextSize(28);
        llview.addView(tv0);

        TextView tv1 = findViewById(R.id.tvId);
        tv1.setBackgroundColor(Color.DKGRAY);
        tv1.setText("Updated String");

    }

}
