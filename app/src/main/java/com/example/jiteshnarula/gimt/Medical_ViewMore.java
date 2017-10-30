package com.example.jiteshnarula.gimt;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Medical_ViewMore extends AppCompatActivity{

    ListView listView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_viewmore_layout);

        listView = (ListView) findViewById(R.id.listView1);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Medical_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Medical_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Medical_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Medical_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });
         TextView textView = (TextView) findViewById(R.id.textView);
         TextView textView11 = (TextView) findViewById(R.id.textView11);
         TextView textView12 = (TextView) findViewById(R.id.textView12);

         textView.setText("Medical Facility");
         textView11.setText("Medical Facility");
         textView12.setText("GIMT has a full fledged despensary . This despensary is headed by Dr…….., MBBS. The students & staff avail the medicine free of cost.");

     }
}