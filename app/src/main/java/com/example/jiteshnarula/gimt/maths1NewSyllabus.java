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

public class maths1NewSyllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(maths1NewSyllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(maths1NewSyllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(maths1NewSyllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(maths1NewSyllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(maths1NewSyllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("Applied Mathematics-I");
        titleTextView.setText("Applied Mathematics-I");
        msgTextView.setText("\n\nUnit - I\n\n" +
                "Linear Algebra: Rank of a matrix, elementary transformations, elementary matrices, Gauss\n" +
                "Jordon method to find inverse using elementary transformations, normal form of a matrix,\n" +
                "linear dependence and independence of vectors, consistency of linear system of equations,\n" +
                "linear and orthogonal transformations, eigenvalues and eigenvectors, properties of\n" +
                "eigenvalues, Cayley - Hamilton theorem and its applications, diagonalization of matrices,\n" +
                "quadratic forms.\n" +
                "\n\nUnit - II\n\n" +
                "Differential Calculus I: Successive differentiation, Leibnitz theorem and applications,\n" +
                "Taylor’s and Maclaurin’s series (single variable), Expansion of functions, Asymptotes\n" +
                "(Cartesian and Polar Co-ord.), Curve Tracing (for standard curves, Cartesian and Polar)\n" +
                "\n\nUnit - III\n\n" +
                "Differential Calculus II: Concept of limit and continuity of a function of two and three\n" +
                "variables, Partial derivatives, variable treated as constant, Euler’s theorem on Homogeneous\n" +
                "functions, total derivative, differentiation of an implicit function, chain rule, change of\n" +
                "variables, Jacobian, Taylor’s and Maclaurin’s series(two variables). Maxima and minima of a\n" +
                "function of two variables, Lagrange’s method of undetermined multipliers\n" +
                "\n\nUnit - IV\n\n" +
                "Integral Calculus: Application of single integration to find the volume and surface areas of\n" +
                "solid of revolution, Double integrals, Change of order of integration, Areas enclosed by plane\n" +
                "curves, Triple integrals, Volume of solids, Change of variables.\n" +
                "8\n" +
                "\n\nText Books\n\n" +
                "1. E. Kreyszig, Advanced Engineering Mathematics, Wiley India.");



    }



    }
