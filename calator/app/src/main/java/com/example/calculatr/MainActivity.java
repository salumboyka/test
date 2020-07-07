package com.example.calculatr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button des;

    private Button add;
    private Button sub;
    private Button mul;
    private Button dev;
    private Button eq;

    private Button clear;

    private TextView inf;
    private TextView res;
    private final char adition = '+';
    private final char substitution = '-';
    private final char mult = '*';
    private final char devid = '/';
    private final char equ = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "0");
            }

        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "1");
            }

        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "2");
            }

        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "3");
            }

        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "4");
            }

        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "5");
            }

        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "6");
            }

        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "7");
            }

        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "8");
            }

        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + "9");
            }

        });

        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inf.setText(inf.getText().toString() + ".");
            }

        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=adition;
                res.setText(String.valueOf(val1) + "+");
                inf.setText(null);
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=substitution;
                res.setText(String.valueOf(val1) + "-");
                inf.setText(null);
            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=mult;
                res.setText(String.valueOf(val1) + "*");
                inf.setText(null);
            }

        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=devid;
                res.setText(String.valueOf(val1) + "/");
                inf.setText(null);
            }

        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action=equ;
                res.setText(res.getText().toString()+ String.valueOf(val2) + "=" + String.valueOf(val1));
                inf.setText(null);
            }

        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inf.getText().length()>0){
                    CharSequence name  = inf .getText().toString();
                    inf.setText(name.subSequence(0, name.length()-1));

                }else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    inf.setText(null);
                    res.setText(null);
                }
            }
        });

    }
    private void setupUIViews(){

        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        des = (Button)findViewById(R.id.btndes);

        eq = (Button)findViewById(R.id.btneqs);

        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnmut);
        dev = (Button)findViewById(R.id.btndev);

        clear = (Button)findViewById(R.id.btnclear);

        inf = (TextView)findViewById(R.id.txtinf);
        res = (TextView)findViewById(R.id.txtres);


    }

    private void compute(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(inf.getText().toString());

            switch(action){
                case adition:
                    val1=val1+val2;
                    break;
                case substitution:
                    val1=val1-val2;
                    break;
                case mult:
                    val1=val1*val2;
                    break;
                case devid:
                    val1=val1/val2;
                    break;
                case equ:
                    break;
            }
        }else {
            val1 = Double.parseDouble(inf.getText().toString());
        }
    }
}