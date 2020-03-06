package com.therealsanjeev.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    final static String KEY_1="NAME";
    public static String KEY_2="AGE";
    public static String KEY_3="isStudent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                i.putExtra(KEY_1,"Sanjeev");
                i.putExtra(KEY_2,19);
                i.putExtra(KEY_3,false);

                startActivity(i);
            }
        });
    }
}