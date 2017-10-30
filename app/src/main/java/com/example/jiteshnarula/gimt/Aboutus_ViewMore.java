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
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;

public class Aboutus_ViewMore extends AppCompatActivity{

    ListView listView;
    TextView coursesTextView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_activity_layout);
        coursesTextView =  (TextView) findViewById(R.id.coursesTextView);
         coursesTextView.setText("Institute");
        listView = (ListView) findViewById(R.id.listView1);
         listView = (ListView) findViewById(R.id.listView1);
        TextView coursesTextView = (TextView) findViewById(R.id.coursesTextView);
         coursesTextView.setText("Admission Form");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Aboutus_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Aboutus_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Aboutus_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Aboutus_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });


         arrayList = new ArrayList<>();

         arrayList.add(new ViewMore("drawable://" + R.drawable.msg1,"Chairman Message"));
         arrayList.add(new ViewMore("drawable://"+R.drawable.msg2,"Principal Message"));
         arrayList.add(new ViewMore("drawable://" + R.drawable.quality,"Quality Policy & Quality Objectives"));
         arrayList.add(new ViewMore("drawable://" + R.drawable.eligibility,"Courses & Eligibility Criteria"));
         arrayList.add(new ViewMore("drawable://" + R.drawable.fees,"Fees Structure"));
         arrayList.add(new ViewMore("drawable://" + R.drawable.form_download,"Forms"));


         ViewMoreAdapter viewMoreAdapter = new ViewMoreAdapter(getApplicationContext(),R.layout.listview_layout,arrayList);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 switch (position){
                     case 0:{
                         Intent intent1 = new Intent(Aboutus_ViewMore.this,Chairman_ViewMore.class);
                         startActivityForResult(intent1,0);
                         break;
                     }
                     case 1:{
                         Intent intent2 = new Intent(Aboutus_ViewMore.this,Principal_ViewMore.class);
                         startActivityForResult(intent2,1); break;
                     }
                     case 2:{
                         Intent intent3 = new Intent(Aboutus_ViewMore.this,Quality_ViewMore.class);
                         startActivityForResult(intent3,2); break;
                     }
                     case 3:{
                         Intent intent4 = new Intent(Aboutus_ViewMore.this,Courses_ViewMore.class);
                         startActivityForResult(intent4,3); break;
                     }
                     case 4:{
                         Intent intent5 = new Intent(Aboutus_ViewMore.this,Fees_ViewMore.class);
                         startActivityForResult(intent5,4); break;
                     }
                     case 5:{
                         Intent intent6 = new Intent(Aboutus_ViewMore.this,Download_ViewMore.class);
                         startActivityForResult(intent6,5); break;
                     }
                 }
             }
         });

         listView.setAdapter(viewMoreAdapter);

     }
}