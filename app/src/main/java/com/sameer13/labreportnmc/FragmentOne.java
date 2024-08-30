package com.sameer13.labreportnmc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public  class  FragmentOne extends Fragment{

    EditText input;
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);

        input  = view.findViewById(R.id.inputText);
        btn =view.findViewById(R.id.sendButton);

        btn.setOnClickListener(v->{
            String text=input.getText().toString();
            if(getActivity() instanceof FragementExample){
                ((FragementExample) getActivity()).sendDataToFragmentSecond(text);
            }
        });

        return view;
    }
}