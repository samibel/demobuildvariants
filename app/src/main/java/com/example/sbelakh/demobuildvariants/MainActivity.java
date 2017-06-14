package com.example.sbelakh.demobuildvariants;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.sbelakh.demobuildvariants.util.Helper;
import com.example.sbelakh.demobuildvariants.util.HelperImpl;


public class MainActivity extends AppCompatActivity {

    TextView containerTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        containerTextview = (TextView) findViewById(R.id.container);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Helper help = new HelperImpl();
        containerTextview.setText(help.getFlavor());
    }
}
