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

public class Placements_ViewMore extends AppCompatActivity{
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
                        Intent homeIntent = new Intent(Placements_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Placements_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Placements_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Placements_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });
        arrayList = new ArrayList<>();

        arrayList.add(new ViewMore("drawable://" + R.drawable.placements,"2016-2017"));
        arrayList.add(new ViewMore("drawable://"+R.drawable.fac,"2015-2016"));

        ViewMoreAdapter viewMoreAdapter = new ViewMoreAdapter(getApplicationContext(),R.layout.listview_layout,arrayList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:{
                        Intent intent1 = new Intent(Placements_ViewMore.this,Placements1_ViewMore.class);
                        startActivityForResult(intent1,0);
                        break;
                    }
                    case 1:{
                        Intent intent2 = new Intent(Placements_ViewMore.this,Placements2_ViewMore.class);
                        startActivityForResult(intent2,1); break;
                    }

                }
            }
        });

        listView.setAdapter(viewMoreAdapter);


    }
}