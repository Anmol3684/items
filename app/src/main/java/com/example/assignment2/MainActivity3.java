package com.example.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.listview2);
        String tutorials[]
                = { "Apple",
                "Tomato",
                "Tomato",
                "Banana",
                "Orange" };
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                tutorials);
        l.setAdapter(arr);
        TextView edt1,edt2,edt3;
        edt1 = findViewById(R.id.id_no);
        edt2 = findViewById(R.id.id_product);
        edt3 = findViewById(R.id.id_price);
        Intent intent = getIntent();
        String text, text2,text3;
        text = intent.getStringExtra(MainActivity2.Extra_text4);
        text2 = intent.getStringExtra(MainActivity2.Extra_text5);
        text3 = intent.getStringExtra(MainActivity2.Extra_text6);
        edt1.setText(text);
        edt2.setText(text2);
        edt3.setText(text3);
    }
}