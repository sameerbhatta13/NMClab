package com.sameer13.labreportnmc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QuestionThree extends AppCompatActivity {

    private EditText nameEditText;
    private Button okButton;
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);

        nameEditText = findViewById(R.id.nameEditText);
        okButton = findViewById(R.id.okButton);
        messageTextView = findViewById(R.id.messageTextView);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                if (!name.isEmpty()) {
                    String message = "Hello, " + name + "!";
                    messageTextView.setText(message);
                } else {
                    messageTextView.setText("Please enter your name.");
                }
            }
        });
    }
}