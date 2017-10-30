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

public class CseSem3NewSyllabusSubjects extends AppCompatActivity {

    RadioButton button1,button2,button3,button4,button5,button6,button7;
     RadioGroup radioButtonGroup;
     RadioButton radioButton;
    RelativeLayout courseRelLay;
    RelativeLayout branchRelLay;
    RelativeLayout semRelLay,sessionRelLay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_sem3_new_syllabus_subjects);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        button1 = (RadioButton) findViewById(R.id.mathsRadioButton);
        button2 = (RadioButton) findViewById(R.id.phyRadioButton);
        button3 = (RadioButton) findViewById(R.id.btRadioButton);
        button4 = (RadioButton) findViewById(R.id.eeeRadioButton);
        button5 = (RadioButton) findViewById(R.id.mpRadioButton);
        button6 = (RadioButton) findViewById(R.id.focpRadioButton);
        button7 = (RadioButton) findViewById(R.id.RadioButton7);

        button2.setText("Fundamentals of Management");
        button1.setText("Discrete Structures");
       button6.setText("Data Structures");
        button4.setText("Data Base Management Systems");
       button3.setText("Digital Electronics");
        button5.setText("Programming Languages");


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(CseSem3NewSyllabusSubjects.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(CseSem3NewSyllabusSubjects.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(CseSem3NewSyllabusSubjects.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(CseSem3NewSyllabusSubjects.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(CseSem3NewSyllabusSubjects.this,LocationActivity.class);
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

        switch (radioButton.getId()) {

            case R.id.phyRadioButton:
               Intent intent1 = new Intent(CseSem3NewSyllabusSubjects.this,fom3NewSyllabus. class);
                startActivity(intent1);
                break;

            case R.id.mathsRadioButton:

                Intent intent2 = new Intent(CseSem3NewSyllabusSubjects.this, dss3NewSyllabus.class);
                startActivity(intent2);
                break;

            case R.id.focpRadioButton:

                Intent intent3 = new Intent(CseSem3NewSyllabusSubjects.this,ds3NewSyllabus. class);
                startActivity(intent3);
                break;

            case R.id.eeeRadioButton:

                Intent intent4 = new Intent(CseSem3NewSyllabusSubjects.this, dbms3NewSyllabus.class);
                startActivity(intent4);
                break;

            case R.id.btRadioButton:
                Intent intent5 = new Intent(CseSem3NewSyllabusSubjects.this,de3NewSyllabus. class);
                startActivity(intent5);
                break;

            case R.id.mpRadioButton:

                Intent intent6 = new Intent(CseSem3NewSyllabusSubjects.this, pl3NewSyllabus.class);
                startActivity(intent6);
                break;

            case R.id.RadioButton7:

                Intent intent7 = new Intent(CseSem3NewSyllabusSubjects.this, es3NewSyllabus.class);
                startActivity(intent7);
                break;
        }

    }
}