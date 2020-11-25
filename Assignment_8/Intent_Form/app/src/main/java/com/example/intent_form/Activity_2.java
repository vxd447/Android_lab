package com.example.intent_form;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_2 extends AppCompatActivity {
    TextView name, roll;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        name = findViewById(R.id.name);
        roll = findViewById(R.id.roll);
        Bundle bundle = getIntent().getExtras();
        name.setText(bundle.getString("name"));
        roll.setText(bundle.getString("roll"));
    }
}
