package com.example.myapplicatio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
Button dollar,euro,pound;
TextView textView;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dollar=findViewById(R.id.dollar);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String y = editText.getText().toString();
                if (TextUtils.isEmpty(y)) {
                    editText.setError("empty user input");
                } else {
                    double n, k;
                    n = Double.parseDouble(y);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.012;
                   // DecimalFormat number = new DecimalFormat("#.00");
                    //textView.setText("" + number.format(k));
                    textView.setText(""+k);
                }
            }

        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String y = editText.getText().toString();
                if (TextUtils.isEmpty(y)) {
                    editText.setError("empty user input");
                } else {
                    double n, k;
                    n = Double.parseDouble(y);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.011;
                    DecimalFormat number = new DecimalFormat("#.00");
                    textView.setText("" + number.format(k));
                }        }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();
                if (TextUtils.isEmpty(z)) {
                    editText.setError("empty user input");
                } else {
                    double n, k;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    k = n * 0.014;
                    DecimalFormat number = new DecimalFormat("#.00");
                    textView.setText("" + number.format(k));
                }
            }
        });

    }}

