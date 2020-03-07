package com.therealsanjeev.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    final static String KEY_1="NAME";
    public static String KEY_2="AGE";
    public static String KEY_3="isStudent";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.edText);
        Button btn =findViewById(R.id.btn1);
        Button btnDial = findViewById(R.id.btnDial);
        Button btnMail =findViewById(R.id.btnMail);
        Button btnBrowse =findViewById(R.id.btnBrowse);

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

        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=editText.getText().toString();

                Intent mail =new Intent(Intent.ACTION_SENDTO);
                mail.setData(Uri.parse("mailto:"+email));
                mail.putExtra(Intent.EXTRA_EMAIL,email);
                mail.putExtra(Intent.EXTRA_SUBJECT,"Intent Check");

                startActivity(mail);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}