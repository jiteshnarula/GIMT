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

public class Facilities_ViewMore extends AppCompatActivity{

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
                        Intent homeIntent = new Intent(Facilities_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Facilities_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Facilities_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Facilities_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });


        arrayList = new ArrayList<>();

        arrayList.add(new ViewMore("drawable://" + R.drawable.woman,"Women Helpline Numbers"));
        arrayList.add(new ViewMore("drawable://"+R.drawable.transport,"Transport Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.hostel1,"Hostel Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.cafeteria,"Cafeteria Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.medical,"Medical Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.sports1,"Sports Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.library,"Library Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.wifi,"Wi-Fi internet Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.nss,"NSS and NCC"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.gym,"Gymnasium Facility"));
        arrayList.add(new ViewMore("drawable://" + R.drawable.atm,"ATM Facility"));

        ViewMoreAdapter viewMoreAdapter = new ViewMoreAdapter(getApplicationContext(),R.layout.listview_layout,arrayList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:{
                        Intent intent1 = new Intent(Facilities_ViewMore.this,woman_ViewMore.class);
                        startActivityForResult(intent1,0);
                        break;
                    }
                    case 1:{
                        Intent intent2 = new Intent(Facilities_ViewMore.this,Transport_ViewMore.class);
                        startActivityForResult(intent2,1); break;
                    }
                    case 2:{
                        Intent intent3 = new Intent(Facilities_ViewMore.this,Hostel_ViewMore.class);
                        startActivityForResult(intent3,2); break;
                    }
                    case 3:{
                        Intent intent4 = new Intent(Facilities_ViewMore.this,Cafeteria_ViewMore.class);
                        startActivityForResult(intent4,3); break;
                    }
                    case 4:{
                        Intent intent5 = new Intent(Facilities_ViewMore.this,Medical_ViewMore.class);
                        startActivityForResult(intent5,4); break;
                    }
                    case 5:{
                        Intent intent6 = new Intent(Facilities_ViewMore.this,Sports_ViewMore.class);
                        startActivityForResult(intent6,5); break;
                    }

                    case 6:{
                        Intent intent1 = new Intent(Facilities_ViewMore.this,Lib_ViewMore.class);
                        startActivityForResult(intent1,0);
                        break;
                    }
                    case 7:{
                        Intent intent2 = new Intent(Facilities_ViewMore.this,Wifi_ViewMore.class);
                        startActivityForResult(intent2,1); break;
                    }
                    case 8:{
                        Intent intent3 = new Intent(Facilities_ViewMore.this,NSS_ViewMore.class);
                        startActivityForResult(intent3,2); break;
                    }
                    case 9:{
                        Intent intent4 = new Intent(Facilities_ViewMore.this,Gym_ViewMore.class);
                        startActivityForResult(intent4,3); break;
                    }
                    case 10:{
                        Intent intent5 = new Intent(Facilities_ViewMore.this,Atm_ViewMore.class);
                        startActivityForResult(intent5,4); break;
                    }

                }
            }
        });


        listView.setAdapter(viewMoreAdapter);



    }
}