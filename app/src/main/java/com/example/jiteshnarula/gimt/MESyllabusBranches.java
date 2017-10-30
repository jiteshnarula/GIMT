package com.example.jiteshnarula.gimt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

/**
 * Created by Jitesh Narula on 18-10-2017.
 */

public class MESyllabusBranches extends AppCompatActivity {

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
        setContentView(R.layout.me_syllabus_branches);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        courseRelLay = (RelativeLayout) findViewById(R.id.courseRelLay);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(MESyllabusBranches.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(MESyllabusBranches.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(MESyllabusBranches.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(MESyllabusBranches.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(MESyllabusBranches.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });

    }


    public void radioButtonClicked(View view){
        int radioButtonId = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radioButtonId);

        switch (radioButton.getId()){

            case R.id.sem1RadioButton:
                Intent intent1= new Intent(MESyllabusBranches.this,MESessionSyllabus1.class);
                startActivity(intent1);
                break;

            case  R.id.sem2RadioButton:
                Intent intent2= new Intent(MESyllabusBranches.this,MESessionSyllabus2.class);
                startActivity(intent2);
                break;
            case  R.id.sem3RadioButton:
                Intent intent3= new Intent(MESyllabusBranches.this,MESessionSyllabus3.class);
                startActivity(intent3);
                break;
            case R.id.sem4RadioButton:
                Intent intent4 = new Intent(MESyllabusBranches.this,MESessionSyllabus4.class);
                startActivity(intent4);
                break;
            case  R.id.sem5RadioButton:
                Intent intent5 = new Intent(MESyllabusBranches.this,MESessionSyllabus5.class);
                startActivity(intent5);
                break;
            case  R.id.sem6RadioButton:
                Intent intent6 = new Intent(MESyllabusBranches.this,SessionSyllabus6.class);
                startActivity(intent6);
                break;
            case  R.id.sem7RadioButton:
                Intent intent7 = new Intent(MESyllabusBranches.this,SessionSyllabus7.class);
                startActivity(intent7);
                break;
            case  R.id.sem8RadioButton:
                Intent intent8 = new Intent(MESyllabusBranches.this,SessionSyllabus8.class);
                startActivity(intent8);
                break;
        }
    }

}


