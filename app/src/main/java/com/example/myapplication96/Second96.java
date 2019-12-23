package com.example.myapplication96;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second96 extends AppCompatActivity {
    TextView tv,tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second96);

        tv= (TextView) findViewById(R.id.textView2);
        tv1= (TextView) findViewById(R.id.textView3);
        tv2= (TextView) findViewById(R.id.textView4);

        tv.setText("hello" +getIntent().getStringExtra("NAME"));
        tv1.setText("WELCOME TO");
        tv2.setText(getIntent().getStringExtra("DESCRIPTION"));
}
}