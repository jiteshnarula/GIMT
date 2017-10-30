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

public class CseSem7OldSyllabusSubjects extends AppCompatActivity {

    RadioButton button1,button2,button3,button4,button5,button6,button7 ,button8,button9;
     RadioGroup radioButtonGroup;
     RadioButton radioButton;
    RelativeLayout courseRelLay;
    RelativeLayout branchRelLay;
    RelativeLayout semRelLay,sessionRelLay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_sem7_old_syllabus_subjects);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        button1 = (RadioButton) findViewById(R.id.button1);
        button2 = (RadioButton) findViewById(R.id.button2);
        button3 = (RadioButton) findViewById(R.id.button3);
        button4 = (RadioButton) findViewById(R.id.button4);
        button5 = (RadioButton) findViewById(R.id.button5);
           button6 = (RadioButton) findViewById(R.id.button6);
        button7 = (RadioButton) findViewById(R.id.button7);
        button8 = (RadioButton) findViewById(R.id.button8);
        button9 = (RadioButton) findViewById(R.id.button9);


        button1.setText("Compiler Design ");
        button2.setText("Web Engineering   ");
         button3.setText("Statistical Models for Computer Science ");


       button4.setText("Software Project Management  ");
        button5.setText("Embedded System Design ");
        button6.setText("Artificial Intelligence ");
        button7.setText("Image Processing ");

        button8.setText("Unix & Linux Programming ");
        button9.setText("Security & Cryptography ");


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(CseSem7OldSyllabusSubjects.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(CseSem7OldSyllabusSubjects.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(CseSem7OldSyllabusSubjects.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(CseSem7OldSyllabusSubjects.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(CseSem7OldSyllabusSubjects.this,LocationActivity.class);
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

            case R.id.button1:
               Intent intent1 = new Intent(CseSem7OldSyllabusSubjects.this,cd7OldSyllabus. class);
                startActivity(intent1);
                break;

            case R.id.button2:

                Intent intent2 = new Intent(CseSem7OldSyllabusSubjects.this, we7OldSyllabus.class);
                startActivity(intent2);
                break;


            case R.id.button3:

                Intent intent4 = new Intent(CseSem7OldSyllabusSubjects.this, smcs7OldSyllabus.class);
                startActivity(intent4);
                break;

            case R.id.button4:
                Intent intent5 = new Intent(CseSem7OldSyllabusSubjects.this,spm7OldSyllabus. class);
                startActivity(intent5);
                break;


            case R.id.button5:

                Intent intent7 = new Intent(CseSem7OldSyllabusSubjects.this, esd7OldSyllabus.class);
                startActivity(intent7);
                break;

            case R.id.button6:

                Intent intent8 = new Intent(CseSem7OldSyllabusSubjects.this, ai7OldSyllabus.class);
                startActivity(intent8);
                break;

            case R.id.button7:

                Intent intent9 = new Intent(CseSem7OldSyllabusSubjects.this, ip7OldSyllabus.class);
                startActivity(intent9);
                break;

            case R.id.button8:

                Intent intent10 = new Intent(CseSem7OldSyllabusSubjects.this, ulp7OldSyllabus.class);
                startActivity(intent10);
                break;

            case R.id.button9:

                Intent intent11 = new Intent(CseSem7OldSyllabusSubjects.this, sc7OldSyllabus.class);
                startActivity(intent11);
                break;


        }

    }
}