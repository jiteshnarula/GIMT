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
import android.widget.TextView;

/**
 * Created by Jitesh Narula on 18-10-2017.
 */

public class Tc1NewSyllabus extends AppCompatActivity {

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
        setContentView(R.layout.syllabus_layout);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        courseRelLay = (RelativeLayout) findViewById(R.id.courseRelLay);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(Tc1NewSyllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Tc1NewSyllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(Tc1NewSyllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Tc1NewSyllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(Tc1NewSyllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });


        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("Technical Communication");
        titleTextView.setText("Technical Communication");
        msgTextView.setText("\n\nUnit-I\n\n" +
                "Introduction: Meaning; Types; Role of Communication; Barriers to Communication\n" +
                "\n\nUnit-II\n\n" +
                "Communicative Skills:\n" +
                "i) Listening: Traits of a good listener; Barriers\n" +
                "ii) Speaking: Achieving confidence, clarity and fluency; Paralinguistic features\n" +
                "iii) Reading Skills: Vocabulary; Scanning; Skimming; the SQ3R Reading Technique\n" +
                "iv) Writing: Characteristics; Language; Techniques for effective writing\n" +
                "\n\nUnit-III\n\n" +
                "Professional Speaking:\n" +
                "i) Group Discussion ii) Oral Presentation iii) Job Interview\n" +
                "\n\nUnit-IV\n\n" +
                "Technical Writing:\n" +
                "i) Technical letters ii) Job Application and Resume iii) Technical articles\n" +
                "\n\nText Books\n\n" +
                "1. Meenakshi Raman and Sangeeta Sharma, Technical Communication: Principles and\n" +
                "Practice, Oxford University Press\n" +
                "2. M. Ashraf Rizvi, Effective Technical Communication, McGraw Hill ");
    }



    }
