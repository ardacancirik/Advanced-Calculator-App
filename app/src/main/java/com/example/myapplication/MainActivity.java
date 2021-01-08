package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button buttonGC;
    private Button buttonBinary;
    private Button buttonGuides;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) (findViewById(R.id.button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
            }
        });

        buttonGC = (Button) (findViewById(R.id.buttonGC));
        buttonGC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity3();
            }
        });

        buttonBinary = (Button) (findViewById(R.id.buttonBinary));
        buttonBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

        buttonGuides = (Button) (findViewById(R.id.buttonGuides));
        buttonGuides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openGuides();
            }
        });


    }
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void openActivity4(){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void openGuides(){
        Intent intent = new Intent(this, Guides.class);
        startActivity(intent);
    }

}