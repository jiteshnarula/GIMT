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

public class Lib_ViewMore extends AppCompatActivity{

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
                        Intent homeIntent = new Intent(Lib_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Lib_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Lib_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Lib_ViewMore.this, SyllabusActivity.class);
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

         textView.setText("Library Facility");
         textView11.setText("Library Facility");
         textView12.setText("\n" +
                 "The Institute library provides Book Bank Facility in addition to normal library facilities to it’s students.To avail this facility, B.Tech. students are required to deposit Rs.2,500/- (which include Rs.500/- as refundable security) at the time of admission and they will be issued four books per semester. The Students of MBA and MCA desirous of availing above facility will have to pay Rs.2,000/-(which includes Rs.500/’- as refundable security) at the time of admission and they will be issued four books per semester. After the completion of course of study, Rs.500/- (Refundable Book-Bank Security)will be refunded to the concerned students.");

     }
}