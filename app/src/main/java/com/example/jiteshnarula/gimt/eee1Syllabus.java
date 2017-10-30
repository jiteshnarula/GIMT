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

public class eee1Syllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(eee1Syllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(eee1Syllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(eee1Syllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(eee1Syllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(eee1Syllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("EEE");
        titleTextView.setText("ELEMENTS OF ELECTRONICS ENGINEERING");
        msgTextView.setText("\n\nUNIT-I\n\n" +
                "Semiconductors p-type, n-type, pn junction diodes, pn junction as a circuit element, its\n" +
                "characteristics, half wave and full wave and bridge type rectifier circuits basic filter circuits,\n" +
                "Doide as voltage multiplier, clipper & clamper circuit. Zener diode as a voltage regulator.\n" +
                "LED its characteristics construction & applications\n" +
                "\n\nUNIT-II\n\n" +
                "Characteristics of transistors in different configuration. Concept of d.c. and a.c. load line and\n" +
                "operating point selection. Various amplifiers configurations their h-parameter equivalent\n" +
                "circuits determination of voltage gain current gain input resistance and output resistance &\n" +
                "power gain. Concept of feedback in amplifiers, different oscillators circuits (without analysis)\n" +
                "\n\nUNIT-III\n\n" +
                "Differential amplifier and its transfer characteristics. IC Op-Amps, its ideal & practical\n" +
                "specifications and measurement of parameters. Op-Amp in different modes as inverting\n" +
                "amplifier non inverting amplifier scale changer, differentiator & integrator.\n" +
                "\n\nUNIT-IV\n\n" +
                "Characteristics of JFET, MOSFET, Various amplifier configurations using FET.\n" +
                "Characteristics and Construction of SCR, TRIAC, UJT. Their basic areas applications. ");
    }



    }
