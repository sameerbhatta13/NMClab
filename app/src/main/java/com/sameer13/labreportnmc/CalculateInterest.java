package com.sameer13.labreportnmc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculateInterest extends AppCompatActivity {

    private EditText getPrincipal, getRate, getTime;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_interest);

        getPrincipal = findViewById(R.id.principle);
        getRate = findViewById(R.id.rate);
        getTime = findViewById(R.id.time);
        buttonCalculate = findViewById(R.id.calculateButton);
        textViewResult = findViewById(R.id.textViewResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double principal = Double.parseDouble(getPrincipal.getText().toString());
                double rate = Double.parseDouble(getRate.getText().toString());
                double time = Double.parseDouble(getTime.getText().toString());

                double simpleInterest = (principal * rate * time) / 100;

                textViewResult.setText("Simple Interest: " + simpleInterest);
            }
        });
    }
}