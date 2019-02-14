package com.example.harshtiwari.calculator;

import android.support.v7.app.AppCompatActivity;
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
    private Button add;
    private Button subtract;
    private Button Multiply;
    private Button Divide;
    private Button Equal;
    private Button clear;
    private Button clearAll;
    private TextView info;
    private TextView results;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQUAL = '0';
    private double var1 = Double.NaN;
    private double var2;
    private char Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0" );
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1" );
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2" );
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3" );
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4" );
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5" );
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6" );
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7" );
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8" );
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9" );
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action = ADDITION;
                results.setText(String.valueOf(var1) + '+');
                info.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action = SUBTRACTION;
                results.setText(String.valueOf(var1) + '-');
                info.setText(null);
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action = MULTIPLICATION;
                results.setText(String.valueOf(var1) + '*');
                info.setText(null);
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action = DIVISION;
                results.setText(String.valueOf(var1) + '/');
                info.setText(null);
            }
        });
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                Action = EQUAL;
                results.setText(results.getText().toString() + String.valueOf(var2) + "=" + String.valueOf(var1));
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    var1 = Double.NaN;
                    var2 = Double.NaN;
                    info.setText(null);
                    results.setText(null);
                }
            }
        });
        clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(null);
                results.setText(null);
            }
        });


    }

    private void setupUIViews(){
        zero = (Button)findViewById(R.id.button0);
        one = (Button)findViewById(R.id.button1);
        two = (Button)findViewById(R.id.button2);
        three = (Button)findViewById(R.id.button3);
        four = (Button)findViewById(R.id.button4);
        five = (Button)findViewById(R.id.button5);
        six = (Button)findViewById(R.id.button6);
        seven = (Button)findViewById(R.id.button7);
        eight = (Button)findViewById(R.id.button8);
        nine = (Button)findViewById(R.id.button9);
        add = (Button)findViewById(R.id.buttonADD);
        subtract = (Button)findViewById(R.id.buttonSUBTRACT);
        Multiply = (Button)findViewById(R.id.buttonMULTIPLY);
        Divide = (Button)findViewById(R.id.buttonDIVIDE);
        Equal = (Button)findViewById(R.id.buttonEqual);
        info  = (TextView)findViewById(R.id.textView);
        results = (TextView)findViewById(R.id.textView2);
        clear = (Button)findViewById(R.id.buttonCLEAR);
        clearAll = (Button)findViewById(R.id.buttonClrAll);
    }

    private void compute(){
        if(!Double.isNaN(var1)){
            var2 = Double.parseDouble(info.getText().toString());

            switch(Action){
                case ADDITION:
                    var1 = var1+var2;
                    break;
                case SUBTRACTION:
                    var1 = var1-var2;
                    break;
                case MULTIPLICATION:
                    var1 = var1*var2;
                    break;
                case DIVISION:
                    var1 = var1/var2;
                    break;
                case EQUAL:
                    break;

            }
        }
        else {
            var1 = Double.parseDouble(info.getText().toString());
        }
    }
}
