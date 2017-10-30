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

public class EGD1NewSyllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(EGD1NewSyllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(EGD1NewSyllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(EGD1NewSyllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(EGD1NewSyllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(EGD1NewSyllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("Engg. Drawing and Graphics");
        titleTextView.setText("Engg. Drawing and Graphics");
        msgTextView.setText("\n\nUnit-I\n\n" +
                "Introduction, Projection of Points: Introduction to Engineering Equipments, Elements of\n" +
                "Engineering Drawing, Types of Lines, Various types of projections, First and third angle\n" +
                "systems of orthographic projections. Projections of points in different quadrants.\n" +
                "Projection of Straight Lines:\n" +
                "Projections of straight lines: parallel to one or both reference planes, contained by one or\n" +
                "both planes, perpendicular to one of the planes, inclined to one plane but parallel to the other\n" +
                "plane, inclined to both the planes, true length of a line and its inclinations with reference\n" +
                "planes, traces of a line.\n" +
                "\n\nUnit-II\n\n" +
                "Projection of planes: Introduction, types of planes, Projection of planes by change of\n" +
                "position method only, projection of plane perpendicular to a plane, with axis parallel to both\n" +
                "planes, with axis parallel to one plane and inclined to the other plane.\n" +
                "Projection of Solids: Types of solids, Projections of Polyhedra Solids and Solids of\n" +
                "Revolution – in simple positions with axis perpendicular to a plane, with axis parallel to both\n" +
                "planes, with axis parallel to one plane and inclined to the other.\n" +
                "\n\nUnit-III\n\n" +
                "Section of Solids: Introduction - section planes - apparent section - true section - sectional\n" +
                "view - need for sectional view - cutting plane - cutting plane line.\n" +
                "Sectional view of simple solids such as Prism, Cylinders, Pyramids and Cones in simple\n" +
                "positions Section plane perpendicular to one plane and parallel to the other, section plane\n" +
                "perpendicular to one plane and inclined to the other.\n" +
                "Development of Surfaces: Development of surface of various simple solids in simple\n" +
                "positions such as cubes, cylinders, prisms, pyramids etc.\n" +
                "\n\nUnit-IV\n\n" +
                "Orthographic views (First Angle Projection Only): Three orthographic views of solids,\n" +
                "Orthographic Views of Nuts & Bolts.\n" +
                "14\n" +
                "AUTOCAD basics: Cartesian and Polar Co-ordinate system, Absolute and Relative Coordinates\n" +
                "systems.Basic Commands: Line, Point, Rectangle, Polygon, Circle, Arc, Ellipse,\n" +
                "Polyline\n" +
                "Basic editing Commands: Basic Object Selection Methods, Window and Crossing Window\n" +
                "Erase, Move, Copy, Offset, Fillet, Chamfer, Trim, Extend, Mirror Display Commands:\n" +
                "Zoom, Pan, Redraw, and Regenerate Simple dimensioning and text, simple exercises.\n" +
                "\n\nText Book\n\n" +
                "1. T. Jeyapoovan, Engineering Graphics using AUTOCAD 2000, Vikas Publishing\n" +
                "House.\n" +
                "2. Basudeb Bhattacharyya, Machine Drawing, Oxford University Press, New Delhi");
    }



    }
