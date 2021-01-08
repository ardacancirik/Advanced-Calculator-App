package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonDiv, buttonX, buttonRate, buttonMinus, buttonPlus, buttonPercent, buttonDot, buttonEqual, buttonE, buttonAC
            , buttonSin, buttonTan, buttonCos, buttonFactorial, buttonLog, buttonLn, buttonSquareRoot, buttonPower;
    String process;
    TextView txtFinal, txtFirst;
    boolean hasDot;
    String sign, value1, value2;
    Double num1, num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        hasDot = false;

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonX = findViewById(R.id.buttonX);
        buttonRate = findViewById(R.id.buttonRate);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonPercent = findViewById(R.id.buttonPercent);
        buttonDot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonE = findViewById(R.id.buttonE);
        buttonAC = findViewById(R.id.buttonAC);
        buttonSin = findViewById(R.id.buttonSin);
        buttonTan = findViewById(R.id.buttonTan);
        buttonCos = findViewById(R.id.buttonCos);
        buttonFactorial = findViewById(R.id.buttonFactorial);
        buttonLog = findViewById(R.id.buttonLog);
        buttonLn = findViewById(R.id.buttonLn);
        buttonSquareRoot = findViewById(R.id.buttonSquareRoot);
        buttonPower = findViewById(R.id.buttonPower);

        txtFinal = findViewById(R.id.txtFinal);
        txtFirst = findViewById(R.id.txtFirst);

        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFirst.setText("0");
                txtFinal.setText("");
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "000");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtFinal.getText().toString();
                txtFinal.setText(process + "9");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "+";
                value1 = txtFinal.getText().toString();
                process = txtFinal.getText().toString();
                txtFinal.setText(null);
                txtFirst.setText("+");
                hasDot = false;
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "-";
                value1 = txtFinal.getText().toString();
                txtFinal.setText(null);
                txtFirst.setText("-");
                hasDot = false;
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "/";
                value1 = txtFinal.getText().toString();
                txtFinal.setText(null);
                txtFirst.setText("÷");
                hasDot = false;
            }
        });

        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "*";
                value1 = txtFinal.getText().toString();
                txtFinal.setText(null);
                txtFirst.setText("×");
                hasDot = false;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!hasDot) {
                    if (txtFinal.getText().equals("")) {

                        txtFinal.setText("0.");
                    } else {

                        txtFinal.setText(txtFinal.getText() + ".");
                    }

                    hasDot = true;
                }
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "log";
                txtFinal.setText(null);
                txtFirst.setText("log");
                hasDot = false;
            }
        });

        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "ln";
                txtFinal.setText(null);
                txtFirst.setText("ln");
                hasDot = false;
            }
        });

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "power";
                value1 = txtFinal.getText().toString();
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("xⁿ");
            }
        });

        buttonFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "factorial";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("!");

            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "sin";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("sin");
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "cos";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("cos");
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "tan";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("tan");
            }
        });

        buttonSquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "root";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("√");

            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "%";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("%");
            }
        });

        buttonRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign =  "Rate";
                txtFinal.setText(null);
                hasDot = false;
                txtFirst.setText("+/-");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sign == null) {
                    txtFirst.setText("Error!");
                } else if (txtFinal.getText().equals("")) {
                    txtFirst.setText("Error!");
                } else if ((sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) && value1.equals("")) {
                    txtFirst.setText("Error!");
                } else {
                    switch (sign) {
                        default:
                            break;
                        case "log":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value1);
                            txtFinal.setText(Math.log10(num1) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "ln":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value1);
                            txtFinal.setText(Math.log(num1) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "power":
                            num1 = Double.parseDouble((value1));
                            value2 = txtFinal.getText().toString();
                            num2 = Double.parseDouble(value2);
                            txtFinal.setText(Math.pow(num1, num2) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "root":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble((value1));
                            txtFinal.setText(Math.sqrt(num1) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "factorial":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble((value1));
                            int i = Integer.parseInt(value1) - 1;

                            while (i > 0) {
                                num1 = num1 * i;
                                i--;
                            }

                            txtFinal.setText(num1 + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "sin":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble((value1));
                            txtFinal.setText(Math.sin(num1) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "cos":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble((value1));
                            txtFinal.setText(Math.cos(num1) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "tan":
                            value1 = txtFinal.getText().toString();
                            num1 = Double.parseDouble((value1));
                            txtFinal.setText(Math.tan(num1) + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "+":
                            value2 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value1);
                            num2 = Double.parseDouble(value2);
                            result = num1 + num2;
                            txtFinal.setText(result + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "-":
                            value2 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value1);
                            num2 = Double.parseDouble(value2);
                            result = num1 - num2;
                            txtFinal.setText(result + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "*":
                            value2 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value1);
                            num2 = Double.parseDouble(value2);
                            result = num1 * num2;
                            txtFinal.setText(result + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "/":
                            value2 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value1);
                            num2 = Double.parseDouble(value2);
                            result = num1 / num2;
                            txtFinal.setText(result + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "Rate":
                            value2 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value2);
                            result = num1 * -1;
                            txtFinal.setText(result + "");
                            sign = null;
                            txtFirst.setText(null);
                            break;
                        case "%":
                            value2 = txtFinal.getText().toString();
                            num1 = Double.parseDouble(value2);
                            result = num1 /100;
                            txtFinal.setText(result + "");
                            sign = null;
                            txtFirst.setText(null);
                    }

                }

            }
        });
    }

}