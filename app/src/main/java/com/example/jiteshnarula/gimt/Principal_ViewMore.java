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

public class Principal_ViewMore extends AppCompatActivity{

    ListView listView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutus_viewmore_layout);

        listView = (ListView) findViewById(R.id.listView1);
         TextView textView12 = (TextView) findViewById(R.id.textView12);
         TextView textView11 = (TextView) findViewById(R.id.textView11);
         TextView textView = (TextView) findViewById(R.id.textView);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Principal_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Principal_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Principal_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Principal_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });

         textView.setText("Principal Message");
         textView11.setText("S.D Sharma");
         textView12.setText("GIMT is a reputed Engineering College in Haryana " +
                 "having a well developed Infrastructure, Labs, Workshops," +
                 " Library and Hostels supported by experienced faculty. " +
                 "Our mission and vision is to blend Knowledge with " +
                 "Technology and Technology with perfection. We continuously" +
                 " endeavor to develop and envelop the young minds in " +
                 "Technical and Managerial Skills. Finally our aim is to" +
                 " deliver best talent to the corporate world. New students" +
                 " are most welcome to our campus which is situated in " +
                 "lush green surroundings of Kanipla, Kurukshetra.");

     }
}