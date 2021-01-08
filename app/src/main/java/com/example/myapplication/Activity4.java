package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton, radioButton1, radioButton2;
    EditText values;
    TextView nmbrBinary, nmbrOctal, nmbrHex;
    TextView textView, txtValue, txtValue2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView);
        txtValue = findViewById(R.id.txtValue);
        txtValue2 = findViewById(R.id.txtValue2);
        values = findViewById(R.id.values);
        nmbrBinary = findViewById(R.id.nmbrBinary);
        nmbrOctal = findViewById(R.id.nmbrOctal);
        nmbrHex = findViewById(R.id.nmbrHex);
        radioButton1 = findViewById(R.id.RbBinary);
        radioButton2 = findViewById(R.id.RbDecimal);


        Button buttonApply = findViewById(R.id.btnApply);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                textView.setText("Your Choice: " + radioButton.getText());

                if(radioButton.getText().equals("Decimal")){
                    txtValue.setText("Enter Decimal Value: ");
                    txtValue2.setText("Binary Value: ");
                }
                else if(radioButton.getText().equals("Binary")){
                    txtValue.setText("Enter Binary Value: ");
                    txtValue2.setText("Decimal Value: ");
                }
            }
        });

        Button buttonCalculate = findViewById(R.id.btnCalculate);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton2.isChecked()){
                    int dec = Integer.parseInt(values.getText().toString());
                    String bin = Integer.toBinaryString(dec);
                    String oct = Integer.toOctalString(dec);
                    String hex = Integer.toHexString(dec);
                    nmbrBinary.setText(bin);
                    nmbrOctal.setText(oct);
                    nmbrHex.setText(hex);
                }
                else if(radioButton1.isChecked()){
                    int num = getDecimal(values.getText().toString());
                    String str = Integer.toString(num);
                    nmbrBinary.setText(str);
                    int dec = Integer.parseInt(nmbrBinary.getText().toString());
                    String oct = Integer.toOctalString(dec);
                    String hex = Integer.toHexString(dec);
                    nmbrOctal.setText(oct);
                    nmbrHex.setText(hex);
                }

            }
        });
    }
    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);

        Toast.makeText(this, "Selected method is: " + radioButton.getText(), Toast.LENGTH_SHORT).show();

    }

    public static int getDecimal(String n)
    {
        String num = n;
        int dec_value = 0;
        int base = 1;

        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
        return dec_value;
    }
}