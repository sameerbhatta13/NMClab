package com.sameer13.labreportnmc;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DisplayFormValue extends AppCompatActivity {

    private TextView nameDisplay, emailDisplay, phoneDisplay, addressDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form_value);

        nameDisplay = findViewById(R.id.nameDisplay);
        emailDisplay = findViewById(R.id.emailDisplay);
        phoneDisplay = findViewById(R.id.phoneDisplay);
        addressDisplay = findViewById(R.id.addressDisplay);

        // Retrieve the data from Intent
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String address = getIntent().getStringExtra("address");

        // Set the data to the TextViews
        nameDisplay.setText("Name: " + name);
        emailDisplay.setText("Email: " + email);
        phoneDisplay.setText("Phone: " + phone);
        addressDisplay.setText("Address: " + address);
    }
}

