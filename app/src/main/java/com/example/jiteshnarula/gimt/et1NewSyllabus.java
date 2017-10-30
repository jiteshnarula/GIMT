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

public class et1NewSyllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(et1NewSyllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(et1NewSyllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(et1NewSyllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(et1NewSyllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(et1NewSyllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("Electrical Technology");
        titleTextView.setText("Electrical Technology Fundamentals");
        msgTextView.setText(" \n\nUnit - I\n\n" +
                "D.C. circuits excited by independent voltage/current source (steady state): Ohm’s Law,\n" +
                "junction & node, circuit elements classification: Linear & nonlinear, active & passive,\n" +
                "lumped & distributed, unilateral & bilateral with examples. KVL, KCL, Loop analysis of\n" +
                "resistive circuit in the context of dc voltages & currents, Node-voltage analysis of resistive\n" +
                "circuit in the context of dc voltages & currents.Star-Delta transformation for set of pure\n" +
                "resistors. Relevant D.C. circuit analytical problems for quantitative analysis.\n" +
                "Network Theorems: Superposition, Thevenin’s and Norton’s theorems all in the context of\n" +
                "dc voltage and current sources acting in a resistive network,maximum power transfer\n" +
                "theorem, Relevant D.C. circuit analytical problems for quantitative analysis.\n" +
                "\n\nUnit - II\n\n" +
                "AC Fundamentals: Mathematical representation of various wave functions. Sinusoidal\n" +
                "periodic signal, instantaneous & peak values, polar & rectangular form representation of\n" +
                "impedances & phasor quantities. Addition & subtraction of two or more phasor sinusoidal\n" +
                "quantities using component resolution method. RMS & average values of various waveforms\n" +
                "including clipped, clamped, half wave rectified& full wave rectified sinusoidal periodic\n" +
                "waveforms etc. Generation of alternating emf (dynamo). Relevant analytical problems for\n" +
                "quantitative analysis.\n" +
                "A.C. Circuits: Behavior of various components fed by A.C. source. (steady state response of\n" +
                "pure R, pure L, pure C, RL, RC, RLC series with waveforms of instantaneous voltage,\n" +
                "current & power on simultaneous real axis scale and corresponding phasor\n" +
                "diagrams),P.F.active, reactive & apparent power. Frequency response of Series & Parallel\n" +
                "RLC circuit including resonance, Q factor, cut-off frequency & bandwidth. Relevant A.C.\n" +
                "circuit analytical problems solutions using ‘j-omega’ operator method.\n" +
                "18\n" +
                "\n\nUnit - III\n\n" +
                "Balanced Three Phase Systems: Necessity & advantage of three phase system, mode of\n" +
                "generation of 3 phase supply. Phase and line voltages & currents, power. Measurement of 3-\n" +
                "phase power by two wattmeter method for various types of star & delta connected balanced\n" +
                "resistive, inductive & capacitive loads including phasor diagrams at various power factors.\n" +
                "Phase sequence significance. Relevant problems for quantitative analysis.\n" +
                "Electromagnetism & Magnetic circuits (Qualitative analysis only): Laws of EMI,\n" +
                "statically & dynamically induced emf, self & mutual induction, dot notation, RH Screw rule,\n" +
                "Fleming’s RH & LH rules. MMF, Relation between magnetic flux, m.m.f. and reluctance,\n" +
                "magnetic fringing. Hysteresis & Eddy current losses & their minimization\n" +
                "Single Phase Transformer (Qualitative analysis only): Principle, construction & emf\n" +
                "equation. Phasor diagram for ideal case and at no load. Winding resistance & leakage\n" +
                "reactance. Actual transformer at resistive, inductive & capacitive loads with phasor diagrams.\n" +
                "Losses & Efficiency, condition of maximum efficiency, regulation. OC & SC test, direct load\n" +
                "test, equivalent circuit, concept of auto transformer.\n" +
                "\n\nUnit - IV\n\n" +
                "ELECTRICAL MACHINES (Qualitative analysis only)\n" +
                "Prime mover, Stator-Rotor, Field–Armature, necessity of a starter.\n" +
                "D.C. Machines: Principle, general construction & working. Split ring /Commutator\n" +
                "working in DC generator & motor, generated emf equation, Torque Equation. Types of DC\n" +
                "Machines, speed control of DC Shunt motor.\n" +
                "A.C. Machines: 3-phase Induction motor: Concept of rotating magnetic field, principle,\n" +
                "types, general construction and working. Concept of slip & its significance.\n" +
                "Synchronous Generator (alternator): Principle, general construction & working.\n" +
                "Synchronous motor: Principle, general construction & working.\n" +
                "General comparison amongst squirrel cage I.M., phase wound rotor type I.M. & DC motor.\n" +
                "General comparison between alternator & DC generator.\n" +
                "\n\nText Books\n\n" +
                "1. Vijay Kumar Garg, Basic Electrical Engg: A complete Solution, Wiley India Ltd.\n" +
                "2. Rajendra Prasad, Electrical Engg. Fundamentals, PHI Pub.");
    }



    }
