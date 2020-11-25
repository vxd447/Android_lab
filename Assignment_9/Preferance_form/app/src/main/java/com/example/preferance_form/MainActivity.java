package com.example.preferance_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedpref;
    TextView name, email;
    Button btnSave, btnRetr, btnClear;
    public static final String mypref = "mypref";
    public static final String Name = "namekey";
    public static final String Email = "emailkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        btnSave = findViewById(R.id.save);
        btnRetr = findViewById(R.id.retrieve);
        btnClear = findViewById(R.id.clear);
        sharedpref = getSharedPreferences(mypref, Context.MODE_PRIVATE);
        if(sharedpref.contains(Name)){
            name.setText(sharedpref.getString(Name, ""));
        }
        if(sharedpref.contains(Email)){
            email.setText(sharedpref.getString(Email, ""));
        }

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = (TextView) findViewById(R.id.name);
                email = (TextView) findViewById(R.id.email);
                name.setText("");
                email.setText("");
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String e = email.getText().toString();
                SharedPreferences.Editor editor = sharedpref.edit();
                editor.putString(Name, n);
                editor.putString(Email, e);
                editor.commit();
            }
        });

        btnRetr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = (TextView) findViewById(R.id.name);
                email = (TextView) findViewById(R.id.email);
                sharedpref = getSharedPreferences(mypref, Context.MODE_PRIVATE);
                if (sharedpref.contains(Name)) {
                    name.setText(sharedpref.getString(Name, ""));
                }
                if (sharedpref.contains(Email)) {
                    email.setText(sharedpref.getString(Email, ""));
                }

            }
        });
    }



}