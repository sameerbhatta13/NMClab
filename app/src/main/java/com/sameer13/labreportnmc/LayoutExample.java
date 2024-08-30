package com.sameer13.labreportnmc;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;

public class LayoutExample extends AppCompatActivity {

    private FrameLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_example);

        layoutContainer = findViewById(R.id.layoutContainer);

        findViewById(R.id.linearLayoutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadLayout(R.layout.linear_layout);
            }
        });

        findViewById(R.id.relativeLayoutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadLayout(R.layout.relative_layout);
            }
        });

        findViewById(R.id.constraintLayoutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadLayout(R.layout.constraint_layout);
            }
        });

        findViewById(R.id.absoluteLayoutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadLayout(R.layout.absolute_layout);
            }
        });

        findViewById(R.id.tableLayoutButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadLayout(R.layout.table_layout);
            }
        });
    }

    private void loadLayout(int layoutResId) {
        // Clear the current layout
        layoutContainer.removeAllViews();
        // Inflate the new layout and add it to the container
        LayoutInflater.from(this).inflate(layoutResId, layoutContainer, true);
    }
}