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
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Jitesh Narula on 11-10-2017.
 */

public class LocationActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_activity_layout);

         listView = (ListView) findViewById(R.id.listView1);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(LocationActivity.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(LocationActivity.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(LocationActivity.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(LocationActivity.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });
arrayList = new ArrayList<>();

         arrayList.add(new ViewMore("drawable://" + R.drawable.aboutus_viewmore,"Institute"));
         arrayList.add(new ViewMore("drawable://"+R.drawable.fac,"Facilities"));
         arrayList.add(new ViewMore("drawable://" + R.drawable.loc,"How to reach us"));
         arrayList.add(new ViewMore("drawable://" + R.drawable.phone,"Contact us"));

ViewMoreAdapter viewMoreAdapter = new ViewMoreAdapter(getApplicationContext(),R.layout.listview_layout,arrayList);

         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:{
                       Intent intent1 = new Intent(LocationActivity.this,Aboutus_ViewMore.class);
                       startActivityForResult(intent1,0);
                       break;
                   }
                   case 1:{
                       Intent intent2 = new Intent(LocationActivity.this,Facilities_ViewMore.class);
                       startActivityForResult(intent2,1); break;
                   }

                   case 2:{
                       Intent intent4 = new Intent(LocationActivity.this,Reachus_ViewMore.class);
                       startActivityForResult(intent4,3); break;
                   }
                   case 3:{
                       Intent intent5 = new Intent(LocationActivity.this,Contact_ViewMore.class);
                       startActivityForResult(intent5,4); break;
                   }
               }
             }
         });

         listView.setAdapter(viewMoreAdapter);
    }
}
