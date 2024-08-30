package com.sameer13.labreportnmc;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragementExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragement_example);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentOne inputFragment = new FragmentOne();
        FragmentSecond displayFragment = new FragmentSecond();

        fragmentTransaction.add(R.id.fragmentOne, inputFragment);
        fragmentTransaction.add(R.id.fragmentSecond, displayFragment);
        fragmentTransaction.commit();
    }

    public void sendDataToFragmentSecond(String text) {
        FragmentSecond displayFragment = (FragmentSecond) getSupportFragmentManager().findFragmentById(R.id.fragmentSecond);
        if (displayFragment != null) {
            displayFragment.updateText(text);
        }
    }
}