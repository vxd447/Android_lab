package com.example.intent_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView name, roll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (TextView)findViewById(R.id.name);
        roll = (TextView)findViewById(R.id.roll);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Activity_2.class);
                i.putExtra("name", name.getText().toString());
                i.putExtra("roll", roll.getText().toString());
                startActivity(i);
            }
        });
    }
}