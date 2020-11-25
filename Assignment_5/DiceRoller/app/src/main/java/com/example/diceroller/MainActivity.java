package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Random dice = new Random();
        int output = dice.nextInt(6) + 1;
        Toast toast = Toast.makeText(this, String.valueOf(output), Toast.LENGTH_LONG);
        toast.show();
    }
}