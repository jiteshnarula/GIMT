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
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * Created by Jitesh Narula on 11-10-2017.
 */

public class ResultActivity extends AppCompatActivity {

    SectionPagerAdapter sectionPagerAdapter;
    ViewPager viewPager;


     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity_layout);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(ResultActivity.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(ResultActivity.this, LocationActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(ResultActivity.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(ResultActivity.this, LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });


         sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager());
         viewPager = (ViewPager) findViewById(R.id.container);
         setupViewPager(viewPager);

         TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
         tabLayout.setupWithViewPager(viewPager);
         tabLayout.getTabAt(0).setText("Result ");
         tabLayout.getTabAt(1).setText("Re-Evaluation Result ");
         tabLayout.getTabAt(2).setText("Digital K.U.");
      }

    private void setupViewPager(ViewPager viewPager) {
    SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragments(new Regular_Result_Fragment());
        adapter.addFragments(new Re_Evaluation_Result());
        adapter.addFragments(new DigitalKUFragment());
         viewPager.setAdapter(adapter);

    }
}
