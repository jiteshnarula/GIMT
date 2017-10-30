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

public class mp1Syllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(mp1Syllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(mp1Syllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(mp1Syllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(mp1Syllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(mp1Syllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("MANUFACTURING PROCESSES");
        titleTextView.setText("MANUFACTURING PROCESSES");
        msgTextView.setText("\n\nUnit-I\n\n" +
                "Introduction: Introduction to Manufacturing Processes and their Classification.\n" +
                "Industrial Safety; Introduction, Types of Accidents, Causes and Common Sources of\n" +
                "Accidents, Methods of Safety, First Aid.\n" +
                "Engineering Materials: General Properties and Applications of Engineering Materials,\n" +
                "Mild Steel, Medium Carbon Steel, High Carbon Steel, High Speed Steel and Cast Iron.\n" +
                "\n\nUnit-II\n\n" +
                "Foundry: Introduction to Casting Processes, Basic Steps in Casting Process, Pattern,\n" +
                "Types of Patterns, Pattern Allowances, Risers, Runners, Gates, Moulding Sand and its\n" +
                "composition, Sand Preparation, Molding Methods, Core Sands and Core Making, Core\n" +
                "Assembly, Mold Assembly, Melting ( Cupola) and Pouring, Fettling, Casting Defects\n" +
                "and Remedies.\n" +
                "\n\nUnit-III\n\n" +
                "Cold Working ( Sheet Metal Work ): Sheet Metal Operations, Measuring, Layout\n" +
                "Marking, Shearing, Punching, Blanking, Piercing, Forming, Bending and Joining\n" +
                "Advantages and Limitations.\n" +
                "Hot Working Processes: Introduction to Hot Working, Principles of Hot Working\n" +
                "Processes, Forging, Rolling, Extrusion, Wire Drawing. Plant Layout, Objectives of\n" +
                "Layout, Types of Plant Layout and their Advantages.\n" +
                "\n\nUnit-IV\n\n" +
                "Introduction to Machine Tools: Specifications and Uses of commonly used Machine\n" +
                "Tools in a Workshop such as Lathe, Shaper, Planer, Milling, Drilling, Slotter,\n" +
                "Introduction to Metal Cutting. Nomenclature of a Single Points Cutting Tool and\n" +
                "Tool Wear. Mechanics of Chips Formations, Type of Chips , Use of Coolants in\n" +
                "machining.\n" +
                "Welding: Introduction to Welding, Classification of Welding Processes, Gas\n" +
                "Welding: Oxy-Acetylene Welding, Resistance Welding; Spot and Seam Welding, Arc\n" +
                "Welding: Metal Arc, TIG & MIG Welding, Welding Defects and Remedies, Soldering\n" +
                "& Brazing.\n" +
                "\n\nText Books :\n\n" +
                "1. Workshop Technology Vol. I &II - Hazra & Chaudhary, Asian Book Comp., New\n" +
                "Delhi.\n" +
                "2. Process and Materials of Manufacture-Lindberg, R.A. Prentice Hall of India, New\n" +
                "Delhi.\n" +
                "3. Principles of Manufacturing Materials and Processes- Campbell, J.S.- McGraw-\n" +
                "Hill");
    }



    }
