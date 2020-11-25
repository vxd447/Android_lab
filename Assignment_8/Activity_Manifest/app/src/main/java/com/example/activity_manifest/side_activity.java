package com.example.activity_manifest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class side_activity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.side_activity);
        Intent i = getIntent();
        txt = findViewById(R.id.txt);
        txt.setText(i.getStringExtra("Message"));
    }
}
