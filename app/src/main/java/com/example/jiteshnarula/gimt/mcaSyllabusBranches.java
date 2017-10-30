package com.example.jiteshnarula.gimt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

/**
 * Created by Jitesh Narula on 18-10-2017.
 */

public class mcaSyllabusBranches extends AppCompatActivity {

    RadioButton btechRadioButton;
    RadioButton mtechRadioButton;
    RadioButton mbaRadioButton;
    RadioButton bbaRadioButton;
    RadioButton mcaRadioButton;
    RadioGroup radioButtonGroup;
    RadioGroup radioButtonGroup2;
    RadioGroup radioButtonGroup3,radioButtonGroup4;
    RadioButton radioButton;
    RelativeLayout courseRelLay;
    RelativeLayout branchRelLay;
    RelativeLayout semRelLay,sessionRelLay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mca_syllabus_branches);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(mcaSyllabusBranches.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(mcaSyllabusBranches.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(mcaSyllabusBranches.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(mcaSyllabusBranches.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(mcaSyllabusBranches.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });

    }

}