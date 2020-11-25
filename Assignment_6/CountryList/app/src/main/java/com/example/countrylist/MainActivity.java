package com.example.countrylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] Names = {
            "Afghanistan",
            "Albania",
            "Argentina",
            "Brazil",
            "Cambodia",
            "Egypt",
            "Greece",
            "Honduras",
            "India",
            "Italy",
            "Laos",
            "Luxembourg",
            "Madagascar"
    };

    int [] flags = {
            R.drawable.afghanistan,
            R.drawable.albania,
            R.drawable.argentina,
            R.drawable.brazil,
            R.drawable.cambodia,
            R.drawable.egypt,
            R.drawable.greece,
            R.drawable.honduras,
            R.drawable.india,
            R.drawable.italy,
            R.drawable.laos,
            R.drawable.luxembourg,
            R.drawable.madagascar
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);
    }

    class CustomAdapter extends BaseAdapter {
        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public int getCount() {
            return flags.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.list_item, null);
            ImageView flag = view.findViewById(R.id.pic);
            TextView country =  view.findViewById(R.id.title);
            flag.setImageResource(flags[i]);
            country.setText(Names[i]);
            return  view;
        }

    }
}