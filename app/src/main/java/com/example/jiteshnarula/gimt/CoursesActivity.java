package com.example.jiteshnarula.gimt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Jitesh Narula on 11-10-2017.
 */

public class CoursesActivity extends AppCompatActivity {

    SectionPagerAdapter sectionPagerAdapter;
    ViewPager viewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_activity_layout);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(CoursesActivity.this,MainActivity.class);
                        startActivity(homeIntent);
                         break;
                    case R.id.courses:
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(CoursesActivity.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(CoursesActivity.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(CoursesActivity.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });

        sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
        viewPager  = (ViewPager) findViewById(R.id.container);

        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("B.Tech"+" & "+ "M.Tech");

         tabLayout.getTabAt(1).setText("MBA" +" & " + "BBA");

        tabLayout.getTabAt(2).setText("MCA                            ");


    }

    private void setupViewPager(ViewPager viewPager){
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new BTech_Courses());
        adapter.addFragments(new MBA_Courses());
        adapter.addFragments(new MCA_Courses());
        viewPager.setAdapter(adapter);

    }

}
