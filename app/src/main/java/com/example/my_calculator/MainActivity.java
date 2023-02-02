package com.example.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


        TextView input;

        String sign, value1, value2;
        Double num1, num2, result;
        boolean hasDot;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            input = (TextView) findViewById(R.id.input);

            hasDot = false;

        }

        @SuppressLint("SetTextI18n")
        public void btnClick_0(View view) {
            input.setText(input.getText() + "0");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_1(View view) {
            input.setText(input.getText() + "1");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_2(View view) {
            input.setText(input.getText() + "2");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_3(View view) {
            input.setText(input.getText() + "3");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_4(View view) {
            input.setText(input.getText() + "4");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_5(View view) {
            input.setText(input.getText() + "5");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_6(View view) {
            input.setText(input.getText() + "6");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_7(View view) {
            input.setText(input.getText() + "7");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_8(View view) {
            input.setText(input.getText() + "8");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_9(View view) {
            input.setText(input.getText() + "9");
        }

        @SuppressLint("SetTextI18n")
        public void btnClick_dot(View view) {
            if (!hasDot) {
                if (input.getText().equals("")) {

                    input.setText("0.");
                } else

                    hasDot = true;
            }

        }

        public void btnClick_add(View view) {
            sign = "+";
            value1 = input.getText().toString();
            input.setText("+");
            hasDot = false;
        }

        public void btnClick_subtract(View view) {
            sign = "-";
            value1 = input.getText().toString();
            input.setText("-");
            hasDot = false;
        }

        public void btnClick_multiply(View view) {
            sign = "*";
            value1 = input.getText().toString();
            input.setText("×");
            hasDot = false;
        }

        public void btnClick_divide(View view) {
            sign = "/";
            value1 = input.getText().toString();
            input.setText("÷");
            hasDot = false;
        }







        @SuppressLint("SetTextI18n")
        public void btnClick_equal(View view) {
            if (sign == null) {
                input.setText("Error!");
            } else if (input.getText().equals("")) {
                input.setText("Error!");
            } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
                input.setText("Error!");
            } else {
                switch (sign) {
                    default:
                        break;
                    case "log":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        input.setText(Math.log10(num1) + "");
                        sign = null;
                        break;
                    case "ln":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        input.setText(Math.log(num1) + "");
                        sign = null;
                        break;
                    case "power":
                        num1 = Double.parseDouble((value1));
                        value2 = input.getText().toString();
                        num2 = Double.parseDouble(value2);
                        input.setText(Math.pow(num1, num2) + "");
                        sign = null;
                        break;
                    case "root":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.sqrt(num1) + "");
                        sign = null;
                        break;
                    case "factorial":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble((value1));
                        int i = Integer.parseInt(value1) - 1;

                        while (i > 0) {
                            num1 = num1 * i;
                            i--;
                        }

                        input.setText(num1 + "");
                        sign = null;
                        break;
                    case "sin":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.sin(num1) + "");
                        sign = null;
                        break;
                    case "cos":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.cos(num1) + "");
                        sign = null;
                        break;
                    case "tan":
                        value1 = input.getText().toString();
                        num1 = Double.parseDouble((value1));
                        input.setText(Math.tan(num1) + "");
                        sign = null;
                        break;
                    case "+":
                        value2 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        num2 = Double.parseDouble(value2);
                        result = num1 + num2;
                        input.setText(result + "");
                        sign = null;
                        break;
                    case "-":
                        value2 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        num2 = Double.parseDouble(value2);
                        result = num1 - num2;
                        input.setText(result + "");
                        sign = null;
                        break;
                    case "*":
                        value2 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        num2 = Double.parseDouble(value2);
                        result = num1 * num2;
                        input.setText(result + "");
                        sign = null;
                        break;
                    case "/":
                        value2 = input.getText().toString();
                        num1 = Double.parseDouble(value1);
                        num2 = Double.parseDouble(value2);
                        result = num1 / num2;
                        input.setText(result + "");
                        sign = null;
                        break;
                }

            }
        }


        public void btnClick_delete(View view) {
            if (input.getText().equals("")) {
                input.setText(null);
            } else {
                int len = input.getText().length();
                String s = input.getText().toString();
                if (s.charAt(len - 1) == '.') {
                    hasDot = false;
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));

                } else {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }
            }
        }

        public void btnClick_clear(View view) {

            input.setText(null);
            value1 = null;
            value2 = null;
            sign = null;
            hasDot = false;
        }


    }
