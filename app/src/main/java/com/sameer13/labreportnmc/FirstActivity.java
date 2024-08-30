package com.sameer13.labreportnmc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FirstActivity extends AppCompatActivity {
    private EditText inputText;
    private Button sendButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        inputText = findViewById(R.id.inputText);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = inputText.getText().toString();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("text_key", textToSend);
                startActivity(intent);
            }
        });
    }
}