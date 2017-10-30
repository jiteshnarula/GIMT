package com.example.jiteshnarula.gimt;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Chairman_ViewMore extends AppCompatActivity{
TextView textView;
    ListView listView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView = (ListView) findViewById(R.id.listView);
         textView = (TextView) findViewById(R.id.textView);
         ArrayList<CardMainClass> list  = new ArrayList<>();
         ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

         imageView3.setImageResource(R.drawable.msg1);
         textView.setText("Chairman Message");


         BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Chairman_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Chairman_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Chairman_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Chairman_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });


         list.add(new CardMainClass("Rakesh Goyal","drawable://" + R.drawable.chairman,
                 "As Chairman Geeta Education Trust, this is my pleasure to extend a heartily welcome to our new entrants. The trust is making all-out efforts to promote quality in all Initiatives at GIMT, May it be curricular, co-Curricular and extracurricular. We, therefore, expect our students to maintain quality and standards so as to make GIMT as first rate Institute. We, at GIMT, lay lot of stress in grooming our students in all aspect for securing gainful employment. We wish that our student will put in their best to face the challenges of the corporate world. In the times to come, we foresee survival of the fittest. Students are required to work very hard to develop appropriate hard and soft skill for gainful employment.\n" +
                         "\n" +
                         "\n" +
                         "With these few worlds, I wish our students all the best at GIMT and a progressive, professional career."));

         CustomListAdapter1  adapter = new CustomListAdapter1(getApplicationContext(),R.layout.card_layout_main,list);
         listView.setAdapter(adapter);


     }
}