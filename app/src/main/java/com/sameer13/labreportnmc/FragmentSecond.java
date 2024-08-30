package com.sameer13.labreportnmc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentSecond extends Fragment {
    TextView display;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        display = view.findViewById(R.id.displayText);
        return view;

    }

    public void updateText(String text) {
        display.setText(text);
    }
}