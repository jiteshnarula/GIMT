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

public class NSS_ViewMore extends AppCompatActivity{

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
                        Intent homeIntent = new Intent(NSS_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(NSS_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(NSS_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(NSS_ViewMore.this, SyllabusActivity.class);
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

         textView.setText("NSS & NCC");
         textView11.setText("NSS & NCC");
         textView12.setText("National Service Scheme, under the Ministry" +
                 " of Youth Affairs & Sports Govt. of India, popularly" +
                 " known as NSS was launched in Gandhiji's Birth" +
                 " Centenary Year 1969, in 37 Universities involving " +
                 "40,000 students with primary focus on the development" +
                 " of personality of students through community service." +
                 " Today, NSS has more than 3.2 million student volunteers" +
                 " on its roll spread over 298 Universities and 42 (+2) " +
                 "Senior Secondary Councils and Directorate of Vocational" +
                 " Education all over the country. From its inception, " +
                 "more than 3.75 crores students from Universities, " +
                 "Colleges and Institutions of higher learning have " +
                 "benefited from the NSS activities, as student" +
                 "volunteers." +
                 "\n" +
                 "The National Cadet Corps is the Indian military " +
                 "cadet corps with its Headquarters at New Delhi, Delhi, India. It " +
                 "is open to school and college students on voluntary basis. National" +
                 " Cadet Corps is a Tri-Services Organization, comprising the Army, " +
                 "Navy and Air Force, engaged in grooming the youth of the country " +
                 "into disciplined and patriotic citizens. The National Cadet Corps " +
                 "in India is a voluntary organization which recruits cadets from " +
                 "high schools, colleges and universities all over India. The Cadets" +
                 " are given basic military training in small arms and parades. The " +
                 "officers and cadets have no liability for active military service " +
                 "once they complete their course but are given preference over " +
                 "normal candidates during " +
                 "selections based on the achievements in the corps.");

     }
}