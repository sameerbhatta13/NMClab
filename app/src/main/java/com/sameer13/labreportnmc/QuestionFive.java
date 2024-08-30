package com.sameer13.labreportnmc;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class QuestionFive extends AppCompatActivity {

     EditText username, password, address, age;
     RadioGroup genderRadio;
     Button date, submit;
     TextView dob, outputValue;
     Spinner state;

    private String selectedDateOfBirth = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        address = findViewById(R.id.address);
        age = findViewById(R.id.age);
        genderRadio = findViewById(R.id.genderRadio);
        date = findViewById(R.id.date);
        dob = findViewById(R.id.dob);
        submit = findViewById(R.id.submit);
        outputValue = findViewById(R.id.output);
        state = findViewById(R.id.state);

        // Setup the spinner with state options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.states_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(adapter);

        // DatePicker setup
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });

        // Submit button click listener
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayData();
            }
        });
    }

    private void showDatePicker() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    selectedDateOfBirth = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    dob.setText(selectedDateOfBirth);
                }, year, month, day);
        datePickerDialog.show();
    }

    private void displayData() {
        String userName = username.getText().toString();
        String passwordValue = password.getText().toString();
        String addressValue = address.getText().toString();
        String ageValue = age.getText().toString();
        String genderType = ((RadioButton) findViewById(genderRadio.getCheckedRadioButtonId())).getText().toString();
        String stateValue = state.getSelectedItem().toString();

        String output = "User Name: " + userName + "\n" +
                "Password: " + passwordValue + "\n" +
                "Address: " + addressValue + "\n" +
                "Gender: " + genderType + "\n" +
                "Age: " + ageValue + "\n" +
                "Date of Birth: " + selectedDateOfBirth + "\n" +
                "State: " + stateValue;

        outputValue.setText(output);
    }
}