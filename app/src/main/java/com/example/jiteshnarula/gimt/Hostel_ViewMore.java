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

public class Hostel_ViewMore extends AppCompatActivity{

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
                        Intent homeIntent = new Intent(Hostel_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Hostel_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Hostel_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Hostel_ViewMore.this, SyllabusActivity.class);
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

         textView.setText("Hostel Facility");
         textView11.setText("Hostel Facility");
         textView12.setText("\n" +
                 "GIMT has separate hostels for boys & girls with all modern facilities & attached mess. We ensure that students dwell in healthy environment that helps them to grow and learn without any obstacle.\n" +
                 "\n" +
                 "Boys’ hostel is within the campus and each room is meant f" +
                 "or three students. Every room has attached toilet & bathroom." +
                 "GIMT has well furnished Girls Hostel with each " +
                 "room having double and triple occupancies. Every students in the " +
                 "hostel (boys as well as girls) is provided a bed with mattress," +
                 " Study table with a chair and an almirah. Facility of desert cooler" +
                 " and water cooler in summer and hot water supply in winter is made " +
                 "available to the students without any extra charge. The hostels are" +
                 " provided with 24 hours interrupted power backup, purified drinking" +
                 " water, round the clock security, gym, facility of indoor " +
                 "and outdoor sports/games and  common room with TV facilities.");

     }
}