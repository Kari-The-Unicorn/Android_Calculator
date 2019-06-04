package com.example.kari.appandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot,
            buttonAdd, buttonSub, buttonMult, buttonDiv, buttonAc, buttonEq;
    EditText editText;

    double valueOne, valueTwo;

    boolean add, sub, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button3);
        button1 = (Button) findViewById(R.id.button8);
        button2 = (Button) findViewById(R.id.button9);
        button3 = (Button) findViewById(R.id.button12);
        button4 = (Button) findViewById(R.id.button5);
        button5 = (Button) findViewById(R.id.button7);
        button6 = (Button) findViewById(R.id.button11);
        button7 = (Button) findViewById(R.id.button4);
        button8 = (Button) findViewById(R.id.button6);
        button9 = (Button) findViewById(R.id.button10);
        buttonDot = (Button) findViewById(R.id.button13);
        buttonAdd = (Button) findViewById(R.id.button14);
        buttonSub = (Button) findViewById(R.id.button15);
        buttonMult = (Button) findViewById(R.id.button17);
        buttonDiv = (Button) findViewById(R.id.button16);
        buttonAc = (Button) findViewById(R.id.button2);
        buttonEq = (Button) findViewById(R.id.button18);
        editText = (EditText) findViewById(R.id.editText);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("")){
                    editText.setText("0.");
                } else if(editText.getText().toString().contains(".")){
                editText.setText(editText.getText() +"");
            } else{
                    editText.setText(editText.getText() +".");
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Double.parseDouble(editText.getText() + "");
                add = true;
                editText.setText(null);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
                        @Override
            public void onClick(View v){
                if (editText == null){
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText()+"");
                    sub = true;
                    editText.setText(null);
                }
            }
        });
        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null){
                    editText.setText("");
                } else {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    mult = true;
                    editText.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    valueOne = Double.parseDouble(editText.getText() + "");
                    div = true;
                    editText.setText(null);
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Double.parseDouble(editText.getText() + "");
                if (add == true) {
                    double result = valueOne + valueTwo;
                    if (result%1 == 0) {
                    editText.setText(String.format("%s",(long)result));
                }
                else {
                        editText.setText(String.format("%s",result));
                    }
                    add = false;
                }
                if (sub == true) {
                    double result = valueOne - valueTwo;
                    if (result%1 == 0) {
                    editText.setText(String.format("%s",(long)result));
                }
                else {
                        editText.setText(String.format("%s",result));
                    }
                    sub = false;
                }
                if (mult == true) {
                    double result = valueOne * valueTwo;
                    if (result%1 == 0) {
                        editText.setText(String.format("%s",(long)result));
                    }
                    else {
                        editText.setText(String.format("%s",result));
                    }
                    mult = false;
                }
                if (div == true) {
                    double result = valueOne / valueTwo;
                    if (result%1 == 0) {
                        editText.setText(String.format("%s",(long)result));
                    }
                    else {
                        editText.setText(String.format("%s",result));
                    }
                    div = false;
                }
            }
        });
        }
    }
