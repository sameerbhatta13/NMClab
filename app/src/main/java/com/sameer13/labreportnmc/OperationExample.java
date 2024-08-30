package com.sameer13.labreportnmc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class OperationExample extends AppCompatActivity {

    private EditText number1, num2, operator;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation_example);

        number1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        operator = findViewById(R.id.operator);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
    }

    private void calculateResult() {
        String num1String = number1.getText().toString();
        String num2String = num2.getText().toString();
        String operatorString = operator.getText().toString();

        if (num1String.isEmpty() || num2String.isEmpty() || operatorString.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        double result = 0;

        switch (operatorString) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                break;
            default:
                Toast.makeText(this, "Invalid operator", Toast.LENGTH_SHORT).show();
                return;
        }

        // Display the result using Toast
        Toast.makeText(this, "Result: " + result, Toast.LENGTH_LONG).show();
    }
}