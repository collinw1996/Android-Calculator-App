package edu.towson.cosc431.collinwoodruff.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button one, two, three, four, five, six, seven, eight, nine, zero, decimal, add, subtract, multiply, divide, equal, clear;
    TextView display;
    int num1, num2, result, count;
    float num3, num4, result2;
    boolean flag = false;
    String str = "";
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)findViewById(R.id.button1);
        one.setOnClickListener(this);
        two = (Button)findViewById(R.id.button2);
        two.setOnClickListener(this);
        three = (Button)findViewById(R.id.button3);
        three.setOnClickListener(this);
        four = (Button)findViewById(R.id.button4);
        four.setOnClickListener(this);
        five = (Button)findViewById(R.id.button5);
        five.setOnClickListener(this);
        six = (Button)findViewById(R.id.button6);
        six.setOnClickListener(this);
        seven = (Button)findViewById(R.id.button7);
        seven.setOnClickListener(this);
        eight = (Button)findViewById(R.id.button8);
        eight.setOnClickListener(this);
        nine = (Button)findViewById(R.id.button9);
        nine.setOnClickListener(this);
        zero = (Button)findViewById(R.id.zero);
        zero.setOnClickListener(this);
        decimal = (Button)findViewById(R.id.decimal);
        decimal.setOnClickListener(this);
        add = (Button)findViewById(R.id.addBtn);
        add.setOnClickListener(this);
        subtract = (Button)findViewById(R.id.subBtn);
        subtract.setOnClickListener(this);
        multiply = (Button)findViewById(R.id.multBtn);
        multiply.setOnClickListener(this);
        divide = (Button)findViewById(R.id.divBtn);
        divide.setOnClickListener(this);
        equal = (Button)findViewById(R.id.equalBtn);
        equal.setOnClickListener(this);
        clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(this);
        display = (TextView) findViewById(R.id.display);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                str = str.concat(one.getText().toString());
                display.setText(str);
                break;
            case R.id.button2:
                str = str.concat(two.getText().toString());
                display.setText(str);
                break;
            case R.id.button3:
                str = str.concat(three.getText().toString());
                display.setText(str);
                break;
            case R.id.button4:
                str = str.concat(four.getText().toString());
                display.setText(str);
                break;
            case R.id.button5:
                str = str.concat(five.getText().toString());
                display.setText(str);
                break;
            case R.id.button6:
                str = str.concat(six.getText().toString());
                display.setText(str);
                break;
            case R.id.button7:
                str = str.concat(seven.getText().toString());
                display.setText(str);
                break;
            case R.id.button8:
                str = str.concat(eight.getText().toString());
                display.setText(str);
                break;
            case R.id.button9:
                str = str.concat(nine.getText().toString());
                display.setText(str);
                break;
            case R.id.zero:
                str = str.concat(zero.getText().toString());
                display.setText(str);
                break;
            case R.id.decimal:
                // TODO: 9/27/2017
                count++;
                if(count == 1){
                    flag = true;
                    str = str.concat(decimal.getText().toString());
                    display.setText(str);
                }/*
                else if(count == 2){
                    str = "";
                    display.setText(str);
                    num1 = 0;
                    num2 = 0;
                    flag = false;
                }*/
                break;
            case R.id.addBtn:
                if(flag){
                    num3 = Float.parseFloat(display.getText().toString());
                }
                else
                    num1 = Integer.parseInt(display.getText().toString());
                str = "";
                operator = "+";
                count = 0;
                display.setText(str);
                break;
            case R.id.subBtn:
                if(flag){
                    num3 = Float.parseFloat(display.getText().toString());
                }
                else
                    num1 = Integer.parseInt(display.getText().toString());
                str = "";
                operator = "-";
                count = 0;
                display.setText(str);
                break;
            case R.id.multBtn:
                if(flag){
                    num3 = Float.parseFloat(display.getText().toString());
                }
                else
                    num1 = Integer.parseInt(display.getText().toString());
                str = "";
                operator = "*";
                count = 0;
                display.setText(str);
                break;
            case R.id.divBtn:
                num3 = Float.parseFloat(display.getText().toString());
                str = "";
                operator = "/";
                count = 0;
                display.setText(str);
                break;
            case R.id.equalBtn:
                if(operator.equals("+")){
                    if(flag) {
                        num4 = Float.parseFloat(display.getText().toString());
                        result2 = num3 + num4;
                        count = 0;
                        display.setText(Float.toString(result2));
                    }
                    else {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 + num2;
                        display.setText(Integer.toString(result));
                    }
                }
                else if(operator.equals("-")){
                    if(flag) {
                        num4 = Float.parseFloat(display.getText().toString());
                        result2 = num3 - num4;
                        count = 0;
                        display.setText(Float.toString(result2));
                    }
                    else {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 - num2;
                        display.setText(Integer.toString(result));
                    }
                }
                else if(operator.equals("*")){
                    if(flag) {
                        num4 = Float.parseFloat(display.getText().toString());
                        result2 = num3 * num4;
                        count = 0;
                        display.setText(Float.toString(result2));
                    }
                    else {
                        num2 = Integer.parseInt(display.getText().toString());
                        result = num1 * num2;
                        display.setText(Integer.toString(result));
                    }
                }
                else if(operator.equals("/")){
                    num4 = Float.parseFloat(display.getText().toString());
                    if(num4 == 0)
                        result2 = 0;
                    else
                        result2 = (Float)(num3 / num4);
                    flag = true;
                    count = 0;
                    display.setText(Float.toString(result2));
                }
                break;
            case R.id.clear:
                str = "";
                display.setText(str);
                num1 = 0;
                num2 = 0;
                num3 = 0;
                num4 = 0;
                count = 0;
                flag = false;
                break;
        }
    }
}
