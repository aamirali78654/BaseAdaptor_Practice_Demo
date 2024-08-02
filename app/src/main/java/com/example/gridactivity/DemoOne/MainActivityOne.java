package com.example.gridactivity.DemoOne;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gridactivity.DemoOne.AdaptorBaseOne.adaptorBase;
import com.example.gridactivity.R;

public class MainActivityOne extends AppCompatActivity {
    GridView gridview_id;
    int []animal_arr = {R.drawable.cat,R.drawable.dogs,R.drawable.dolphin,R.drawable.hedgehog,R.drawable.ducklens,R.drawable.pexels,R.drawable.tabbycat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_one);
        gridview_id = (GridView) findViewById(R.id.gridview_id);
        adaptorBase adaptorbase = new adaptorBase(getApplicationContext() , animal_arr);
        gridview_id.setAdapter(adaptorbase);


    }
}