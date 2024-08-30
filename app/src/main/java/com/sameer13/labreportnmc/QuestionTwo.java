package com.sameer13.labreportnmc;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QuestionTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView phoneTextView = findViewById(R.id.phoneTextView);
        TextView addressTextView = findViewById(R.id.addressTextView);
        ImageView imageView = findViewById(R.id.imageView);

        nameTextView.setText("sameer");
        emailTextView.setText("sammer12@gmail.com");
        phoneTextView.setText("1234566");
        addressTextView.setText("KTM");
        imageView.setImageResource(R.drawable.car);
    }
}
