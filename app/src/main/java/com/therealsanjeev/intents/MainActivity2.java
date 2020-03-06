package com.therealsanjeev.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static com.therealsanjeev.intents.MainActivity.KEY_1;
import static com.therealsanjeev.intents.MainActivity.KEY_2;
import static com.therealsanjeev.intents.MainActivity.KEY_3;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String i=getIntent().getStringExtra(KEY_1);
        int age=getIntent().getIntExtra(KEY_2,0);
        boolean is =getIntent().getBooleanExtra(KEY_3,false);

        TextView textView= findViewById(R.id.textView);

        textView.setText(i+"\n"+ age+"\n"+is);

    }
}