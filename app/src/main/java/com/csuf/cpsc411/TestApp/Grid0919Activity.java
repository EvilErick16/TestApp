package com.csuf.cpsc411.TestApp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Grid0919Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create root layout for a grid
        GridLayout root = new GridLayout(this);

        // Set parameters for grid layout object root
        root.setColumnCount(2);
        root.setRowCount(3);
        root.setBackgroundColor(Color.CYAN);
        //root.setOrientation(GridLayout.VERTICAL);

        // Call subroutine to add widgets to root
        createWidgets(root);
        //createWidgetAtCell(root, "String 0", 0, 1);
        //createWidgetAtCell(root, "String 1", 2, 2);
        //createWidgetAtCell(root, "String 2", 1, 2);


        // Display root object on screen
        setContentView(root);
    }

    // Helper function for creating text view objects and add them to the gid layout
    private void createWidgets(GridLayout l) {
        for (int i = 0; i < 7; i++) {

            TextView tv = new TextView(this );
            tv.setText("String" + i );
            tv.setTextSize(24);
            tv.setBackgroundColor(Color.LTGRAY);

            l.addView(tv);
        }
    }

    private void createWidgetAtCell(GridLayout l, String str, int row, int col) {
        // Cell will be defined by the row and column spec object
        GridLayout.Spec rowSpec;
        GridLayout.Spec colSpec;

        if (col == 1 && row == 0) {
            rowSpec = GridLayout.spec(row, GridLayout.CENTER, 0f);
            colSpec = GridLayout.spec(col, 0f);
        }
        else {
            if (col == 0 && row == 0) {

                rowSpec = GridLayout.spec(row, 1f);
                colSpec = GridLayout.spec(col, 2, 1f);
            }
            else {
                rowSpec = GridLayout.spec(row, 1f);
                colSpec = GridLayout.spec(col, 1f);
            }
        }

        // Create TextView object
        TextView tv = new TextView(this);
        tv.setText(str);
        tv.setTextSize(24);
        tv.setBackgroundColor(Color.RED);

        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        params.setMargins(5, 5, 5, 5);

        // Add parameters to text view object and add text view object to grid object
        tv.setLayoutParams(params);
        l.addView(tv);
    }

}
