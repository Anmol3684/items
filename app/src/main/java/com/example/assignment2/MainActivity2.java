package com.example.assignment2;

import static com.example.assignment2.R.layout.activity_main2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    public String text,text2,text3;
    public static final String Extra_text4 = "com.example.assignment2.Extra_text4";
    public static final String Extra_text5 = "com.example.assignment2.Extra_text5";
    public static final String Extra_text6 = "com.example.assignment2.Extra_text6";
    Button history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main2);
        history = findViewById(R.id.History);
        Intent intent = getIntent();
        text = intent.getStringExtra(MainActivity.Extra_text);
        text2 = intent.getStringExtra(MainActivity.Extra_text2);
        text3 = intent.getStringExtra(MainActivity.Extra_text3);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcivity3();
            }
        });
    }

    public void openAcivity3() {
        Intent intent = new Intent(this,MainActivity3.class);
        intent.putExtra(Extra_text4,text);
        intent.putExtra(Extra_text5,text2);
        intent.putExtra(Extra_text6,text3);
        startActivity(intent);
    }
}