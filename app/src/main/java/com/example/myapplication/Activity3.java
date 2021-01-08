package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Rectangle;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Activity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button process;
    TextView finalText, numberRadius, numberHeight, numberLength, numberWidth;
    String height, width, length, radius, process2;
    Double value1, value2, value3;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        process = findViewById(R.id.btnProcess);
        finalText = findViewById(R.id.finalText);
        numberHeight = findViewById(R.id.numberHeight);
        numberLength = findViewById(R.id.numberLength);
        numberRadius = findViewById(R.id.numberRadius);
        numberWidth = findViewById(R.id.numberWidth);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Shapes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().equals("Rectangle")){
                    if(numberLength == null || numberWidth == null){
                        finalText.setText("Error!");
                    }
                    else{
                    length = numberLength.getText().toString();
                    width = numberWidth.getText().toString();
                    value1 = Double.parseDouble(length);
                    value2 = Double.parseDouble(width);
                    finalText.setText("Area of the rectangle: " + rectangleArea(value1, value2));
                    process2 = finalText.getText().toString();
                    finalText.setText(process2 + "\n" + "Perimeter of the rectangle: " + rectanglePerimeter(value1, value2));
                    }
                }
                else if (spinner.getSelectedItem().equals("Circle")){
                    if(numberRadius == null){
                        finalText.setText("Error!");
                    }
                    radius = numberRadius.getText().toString();
                    value1 = Double.parseDouble(radius);
                    finalText.setText("Area of the Circle: " + circleArea(value1));
                    process2 = finalText.getText().toString();
                    finalText.setText(process2 + "\n" + "Circumference of the circle: " + circleCircumference(value1));
                }

                else if(spinner.getSelectedItem().equals("Triangle")){
                    if(numberWidth == null || numberHeight == null){
                        finalText.setText("Error!");
                    }
                    width = numberWidth.getText().toString();
                    value1 = Double.parseDouble(width);
                    height = numberHeight.getText().toString();
                    value2 = Double.parseDouble(height);
                    finalText.setText("Area of Triangle: " + rightTriangleArea(value1, value2));
                    process2 = finalText.getText().toString();
                    finalText.setText(process2 + "\n" + "Perimeter of Triangle: " + rightTrianglePerimeter(value1, value2));
                }

                else if (spinner.getSelectedItem().equals("Box")){
                    if (numberWidth == null || numberLength == null || numberHeight == null){
                        finalText.setText("Error!");
                    }
                    width = numberWidth.getText().toString();
                    value1 = Double.parseDouble(width);
                    height = numberHeight.getText().toString();
                    value2 = Double.parseDouble(height);
                    length = numberLength.getText().toString();
                    value3 = Double.parseDouble(length);
                    finalText.setText("Volume of Box: " + boxVolume(value3, value1, value2));
                    process2 = finalText.getText().toString();
                    finalText.setText(process2 + "\n" + "Surface area of Box: " + boxSurfaceArea(value3, value1, value2));
                }

                else if (spinner.getSelectedItem().equals("Sphere")){
                    if (numberRadius == null){
                        finalText.setText("Error!");
                    }
                    radius = numberRadius.getText().toString();
                    value1 = Double.parseDouble(radius);
                    finalText.setText("Volume of Sphere: " + sphereVolume(value1));
                    process2 = finalText.getText().toString();
                    finalText.setText(process2 + "\n" + "Surface area of Sphere: " + sphereSurfaceArea(value1));
                }
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public static double rectangleArea(double length, double width){
        return length * width;
    }

    public static double rectanglePerimeter(double length, double width){
        return (2*length) + (2* width);
    }

    public static double circleArea(double radius){
        return radius*radius* Math.PI;
    }

    public static double circleCircumference(double radius){
        return 2*Math.PI*radius;
    }

    public static double rightTriangleArea(double base, double height){
        return (base*height)/2;
    }

    public static double rightTrianglePerimeter(double base, double height){
        double x = (base*base) + (height*height);
        double hip = Math.sqrt(x);
        return base + height + hip;
    }

    public static double boxVolume(double length, double width, double depth){
        return length* width * depth;
    }

    public static double boxSurfaceArea(double length, double width, double depth){
        return ((length * width) + (length * depth) + (width* depth)) * 2 ;
    }

    public static double sphereVolume(double radius){
        return (4 * Math.PI * (radius*radius*radius))/3;
    }

    public static double sphereSurfaceArea(double radius){
        return 4 * Math.PI * (radius * radius);
    }
}