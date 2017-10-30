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

public class Sports_ViewMore extends AppCompatActivity{

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
                        Intent homeIntent = new Intent(Sports_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Sports_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Sports_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Sports_ViewMore.this, SyllabusActivity.class);
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

         textView.setText("Sports Facility");
         textView11.setText("Sports Facility");
         textView12.setText("\n" +
                 "Physical  education is an integral part of educational programme  designed to  develop of an individual physically, mentally, socially and  spiritually  through total body movement in the performance of properly  selected  physical activities. The primary aims of physical education  have  varied, based on the, of the time and place. Institutions goal is  to  provide students with knowledge, skills, capacities, values, and the   enthusiasm to maintain a healthy lifestyle to move into adulthood.   Activities included in the programme are designed to promote physical   fitness, to instill knowledge concepts, and strategies. Students learn   to work as part of a team, or as individuals, in a wide variety of   competitive activities.\n" +
                 "\n" +
                 "Sports  has existed since the creation of universe in one form or  the others.  As the world population continues to increase and technology  improves  in areas such as transportation, communication, medicine, and  sports  equipment, sport will continue to evolve and involve more and  more  people. Sport is an activity that is governed by a set of rules or   customs and engaged in competitively. Sport as commonly referred to   activities where the physical capabilities of the competitor are the   sole or primary determinant of the outcome (winning or losing), but the   term is also used to include activities such as mind sports (a common   name for some card games and board games. Sport is commonly defined as   an organized, competitive and skillful physical activity requiring   commitment and fair play.\n" +
                 "\n" +
                 "Sports facilities in the Institute:\n" +
                 " \n" +
                 "Basket ball Court – 1 (One)\n" +
                 "Volley ball Court – 2 (Two)\n" +
                 "Badminton Court – 2 (Two)\n" +
                 "T.T. (Table) – 2 (Two)\n" +
                 "Foot ball Ground – 1 (One)\n" +
                 "Multi Gym 8 station – 1 (One)\n" +
                 "Mannual Jogger – 3 (Three)\n" +
                 "Kabaddi Court – 1 (One)\n" +
                 "Track Events – All\n" +
                 "Kabaddi Court – 1 (One)");

     }
}