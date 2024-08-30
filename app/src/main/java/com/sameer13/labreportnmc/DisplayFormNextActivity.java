package com.sameer13.labreportnmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayFormNextActivity extends AppCompatActivity {

    private EditText name, emailInput, phoneInput, addressInput;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form_next);

        name = findViewById(R.id.name);
        emailInput = findViewById(R.id.emailInput);
        phoneInput = findViewById(R.id.phoneInput);
        addressInput = findViewById(R.id.addressInput);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayFormNextActivity.this, DisplayFormValue.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("email", emailInput.getText().toString());
                intent.putExtra("phone", phoneInput.getText().toString());
                intent.putExtra("address", addressInput.getText().toString());
                startActivity(intent);
            }
        });
    }
}