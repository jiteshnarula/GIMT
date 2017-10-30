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

public class CseSem6OldSyllabusSubjects extends AppCompatActivity {

    RadioButton button1,button2,button3,button4,button5,button6,button7 ,button8;
     RadioGroup radioButtonGroup;
     RadioButton radioButton;
    RelativeLayout courseRelLay;
    RelativeLayout branchRelLay;
    RelativeLayout semRelLay,sessionRelLay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_sem6_old_syllabus_subjects);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        button1 = (RadioButton) findViewById(R.id.mathsRadioButton);
        button2 = (RadioButton) findViewById(R.id.phyRadioButton);
        button3 = (RadioButton) findViewById(R.id.btRadioButton);
        button4 = (RadioButton) findViewById(R.id.eeeRadioButton);
         button6 = (RadioButton) findViewById(R.id.button1);
        button7 = (RadioButton) findViewById(R.id.button2);
        button8 = (RadioButton) findViewById(R.id.button3);



        button2.setText("Mobile  Computing  ");
        button1.setText("Computer Hardware Technology ");
         button4.setText("Network Management and Security ");
       button3.setText("Software Engineering ");
        button6.setText("Multimedia Techniques(Department Elective I)");
        button7.setText("Graph Theory & Combinatorics (Department Elective I) ");
        button8.setText("Logic of Programming (Departmental Elective I)");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(CseSem6OldSyllabusSubjects.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(CseSem6OldSyllabusSubjects.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(CseSem6OldSyllabusSubjects.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(CseSem6OldSyllabusSubjects.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(CseSem6OldSyllabusSubjects.this,LocationActivity.class);
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
               Intent intent1 = new Intent(CseSem6OldSyllabusSubjects.this,mc6OldSyllabus. class);
                startActivity(intent1);
                break;

            case R.id.mathsRadioButton:

                Intent intent2 = new Intent(CseSem6OldSyllabusSubjects.this, cht6OldSyllabus.class);
                startActivity(intent2);
                break;


            case R.id.eeeRadioButton:

                Intent intent4 = new Intent(CseSem6OldSyllabusSubjects.this, nms6OldSyllabus.class);
                startActivity(intent4);
                break;

            case R.id.btRadioButton:
                Intent intent5 = new Intent(CseSem6OldSyllabusSubjects.this,se6OldSyllabus. class);
                startActivity(intent5);
                break;


            case R.id.button1:

                Intent intent7 = new Intent(CseSem6OldSyllabusSubjects.this, mt6OldSyllabus.class);
                startActivity(intent7);
                break;

            case R.id.button2:

                Intent intent8 = new Intent(CseSem6OldSyllabusSubjects.this, gt6OldSyllabus.class);
                startActivity(intent8);
                break;

            case R.id.button3:

                Intent intent9 = new Intent(CseSem6OldSyllabusSubjects.this, lp6OldSyllabus.class);
                startActivity(intent9);
                break;


        }

    }
}