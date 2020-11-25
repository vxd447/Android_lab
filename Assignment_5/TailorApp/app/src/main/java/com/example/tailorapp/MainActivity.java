package com.example.tailorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner sizeSpinner;
    RadioButton male, female;
    EditText height, name, address, ph_no;
    String _name, _size, _address, _ph_no, gender;
    Double _height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sizeSpinner = (Spinner)findViewById(R.id.size_spinner);
        height = findViewById(R.id.height);
        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        ph_no = findViewById(R.id.ph_no);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
    }

    public void onRadioClick(View view){
         if(male.isChecked()){
             gender = "Male";
         } else {
             gender = "Female";
         }
    }

    public void onClick(View view){
        _name = name.getText().toString();
        _address = address.getText().toString();
        _ph_no = ph_no.getText().toString();
        _size = sizeSpinner.getSelectedItem().toString();
        _height = Double.parseDouble(height.getText().toString());
        Double price = calculatePrice();
        TextView ans = findViewById(R.id.price);
        ans.setText("Total Price is " + price.toString());
    }

    public double calculatePrice(){
        if(gender == "Male"){
            if(_size == "L"){
                return _height*300;
            } else if(_size == "XL"){
                return _height*400;
            } else {
                return _height*500;
            }
        } else {
            if(_size == "L"){
                return _height*500;
            } else if(_size == "XL"){
                return _height*700;
            } else {
                return _height*900;
            }
        }
    }

}