package com.genapp.androidgeneratorapp.lib.readers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.genapp.androidgeneratorapp.R;

public class BarCodeReader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_code_reader);
    }
}
