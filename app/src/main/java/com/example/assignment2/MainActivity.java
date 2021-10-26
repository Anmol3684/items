package com.example.assignment2;

import static com.example.assignment2.R.id.No;
import static com.example.assignment2.R.id.listview;
import static com.example.assignment2.R.id.managerOP;
import static com.example.assignment2.R.id.newOP;
import static com.example.assignment2.R.id.producttype;
import static com.example.assignment2.R.id.quantity;
import static com.example.assignment2.R.id.resultText;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String Extra_text = "com.example.assignment2.Extra_text";
    public static final String Extra_text2 = "com.example.assignment2.Extra_text2";
    public static final String Extra_text3 = "com.example.assignment2.Extra_text3";
    Model item2[] = new Model[100];
    private ArrayList<Model> productList;
    private TextView tView,edt1,edt2;
    AlertDialog.Builder builder;
    Button button1,button2,button3,button4,button6,button5,button7,button8,button9,button0,manager;
    @SuppressLint({"SetTextI18n", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        builder = new AlertDialog.Builder(this);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<>();
        ListView lview = findViewById(listview);
        listviewAdapter adapter = new listviewAdapter(this, productList);
        lview.setAdapter(adapter);
        populateList();
        adapter.notifyDataSetChanged();
        tView = findViewById(producttype);
        Button buy = findViewById(newOP);


        lview.setOnItemClickListener((parent, view, position, id) -> {
            String no = ((TextView) view.findViewById(No)).getText().toString();
            String product = ((TextView) view.findViewById(R.id.product)).getText().toString();
            String price = ((TextView) view.findViewById(R.id.price)).getText().toString();
            tView.setText(product);
            buy.setOnClickListener(view1 -> {
                if (edt1.getText().toString().equals("Quantity") || edt1.getText().toString().equals(" ") || tView.getText().toString().equals("product type")) {
                    Snackbar snackbar = Snackbar.make(findViewById(quantity), "Fill all the fields", Snackbar.LENGTH_LONG);
                    snackbar.show();
                } else if(Integer.parseInt(no.trim()) <= Integer.parseInt(edt1.getText().toString().trim()) ){
                    Toast.makeText(MainActivity.this, "Quantity Selected is not available", Toast.LENGTH_LONG).show();
                }else{
                    int total = Integer.parseInt(price.trim())*Integer.parseInt(edt1.getText().toString().trim());
                    edt2.setText(String.valueOf(total));
                    builder.create();
                    builder.setTitle("Thank You for your Shopping");
                    builder.setMessage("You bought " + product + " worth " + "$:"+ edt2.getText().toString() );
                    builder.show();
                    int k =1;
                    for(int i =0 ; i<k+1;i++)
                    item2[i]  = new Model(no,product,price);
                    k++;
                }
            });
        });
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5  = findViewById(R.id.button5);
        button6  = findViewById(R.id.button6);
        button7  = findViewById(R.id.button7);
        button8  = findViewById(R.id.button8);
        button9  = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        Button deleteOP = findViewById(R.id.deleteOP);
        edt2 = findViewById(resultText);
        edt1 = findViewById(quantity);
        manager = findViewById(managerOP);
        manager.setOnClickListener(view -> OpenActivity2());
        button1.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            }
            else if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "1");
            }
            else{
                error();
            }

        });

        deleteOP.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(" ");
            }
            else{
                error();
            }
        });

        button2.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "2");
            }
            else{
                error();
            }
        });

        button3.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "3");
            }
            else{
                error();
            }
        });

        button4.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "4");
            }
            else{
                error();
            }
        });

        button5.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "5");
            }
            else{
               error();
            }
        });

        button6.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "6");
            }
            else{
                error();
            }
        });
        button7.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "7");
            }
            else{
                error();
            }
        });

        button8.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "8");
            }
            else{
                error();
            }
        });

        button9.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "9");
            }
            else{
               error();
            }
        });

        button0.setOnClickListener(v -> {
            if (edt1.getText().toString().equals("Quantity")) {
                edt1.setText(" ");
            } if(!tView.getText().toString().equals("product type")) {
                edt1.setText(edt1.getText() + "0");
            }
            else{
                error();
            }
        });
    }

    private void populateList() {

        Model[] item = new Model[5];

        item[0] = new Model("20", "Apple",  "200");
        productList.add(item[0]);

        item[1] = new Model("50", "Orange",  "100");
        productList.add(item[1]);

        item[2] = new Model("35", "Tomato",  "50");
        productList.add(item[2]);

        item[3]= new Model("30", "Carrot",  "80");
        productList.add(item[3]);

        item[4] = new Model("40", "Banana", "100");
        productList.add(item[4]);
    }
    @SuppressLint("SetTextI18n")
    private void resetall(){
        edt2.setText("Total");
        edt1.setText("Quantity");
        tView.setText("Product type");
    }
    private void error(){
        Snackbar snackbar = Snackbar.make(findViewById(quantity), "Select the product first", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
    public void OpenActivity2(){
        String text = edt1.getText().toString();
        String text2 = edt2.getText().toString();
        String text3 = tView.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
       // intent.putExtra("array", item[2]);
        intent.putExtra(Extra_text,text);
        intent.putExtra(Extra_text2,text2);
        intent.putExtra(Extra_text3,text3);
        startActivity(intent);
    }
}
