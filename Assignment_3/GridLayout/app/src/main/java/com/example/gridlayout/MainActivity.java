package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(new ImageAdapter(this));
    }
}