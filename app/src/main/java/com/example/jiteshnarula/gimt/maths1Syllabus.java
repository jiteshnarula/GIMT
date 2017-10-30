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

public class maths1Syllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(maths1Syllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(maths1Syllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(maths1Syllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(maths1Syllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(maths1Syllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("MATHEMATICS-I");
        titleTextView.setText("MATHEMATICS-I");
        msgTextView.setText("\n\nUNIT-I\n\n" +
                "Applications of Differentiation : Taylor’s & Maclaurin’s series, Expansion by use of known\n" +
                "series, Expansion by forming a differential equation, Asymptotes, Curvature, Radius of\n" +
                "Curvature for Cartesian, Parametric & polar curves, Centre of curvature & chord of curvature,\n" +
                "Tracing of Cartesian & polar curves (standard curves).\n" +
                "\n\nUNIT – II\n\n" +
                "Partial Differentiation & its Applications : Functions of two or more variables Partial\n" +
                "derivatives, Total differential and differentiability, Derivatives of composite and implicit\n" +
                "functions, change of variables.\n" +
                "Homogeneous functions, Euler’s theorem, Jacobian, Taylor’s & Maclaurin’s series for\n" +
                "functions of two variables (without proof), Errors and approximations, Maxima-minima of\n" +
                "functions of two variables, Lagrange’s method of undetermined multipliers, Differentiation\n" +
                "under the integral sign.\n" +
                "\n\nUNIT – III\n\n" +
                "Multiple Integrals and their Applications : Double integral, change of order of integration\n" +
                "Double integral in polar coordinates, Applications of double integral to find area enclosed by\n" +
                "plane curves and volume of solids of revolution.\n" +
                "Triple integral, volume of solids, change of variables0, Beta and gamma functions and\n" +
                "relationship between them.\n" +
                "\n\nUNIT – IV\n\n" +
                "Vector Calculus : Differentiation of vectors, scalar and vector point functions Gradient of a\n" +
                "scalar field and directional derivative, divergence and curl of a vector field and their physical\n" +
                "interpretations, Del applied twice to point functions, Del applied to product of point\n" +
                "functions.\n" +
                "Integration of vectors, line integral, surface integral, volume integral, Green’s, Stoke’s and\n" +
                "Gauss divergence theorems (without proof), and their simple applications.\n" +
                "\n\nTEXT BOOKS:\n\n" +
                "1. Advanced Engineering Mathematics : F. Kreyszig.\n" +
                "2. Higher Engineering Mathematics : B.S. Grewal.");
    }



    }
