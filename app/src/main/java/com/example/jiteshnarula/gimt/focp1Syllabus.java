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

public class focp1Syllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(focp1Syllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(focp1Syllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(focp1Syllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(focp1Syllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(focp1Syllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("FOCP");
        titleTextView.setText("FUNDAMENTALS OF COMPUTERS & PROGRAMMING IN C");
        msgTextView.setText("\n\nUnit-1\n\n" +
                "An Overview of Computer System: Anatomy of a digital Computer, Memory Units,\n" +
                "Main and Auxiliary Storage Devices, Input Devices, Output Devices, Classification of\n" +
                "Computers. Radix number system: Decimal, Binary, Octal, Hexadecimal numbers and\n" +
                "their inter-conversions; Representation of information inside the computers. Operating\n" +
                "System Basics: Introduction to PC operating Systems: DOS, Unix/Linux, Windows\n" +
                "2000.\n" +
                "\n\nUnit-2\n\n" +
                "Programming Languages: Machine-, Assembly-, High Level- Language, introduction\n" +
                "to Assembler, Compiler, Interpreter, Debuggers, Linker and Loader. Programming\n" +
                "fundamentals: problem definition, algorithms, flow charts and their symbols.\n" +
                "Internet basics: How Internet works, Major features of internet, Emails, FTP, Using\n" +
                "the internet.\n" +
                "\n\nUnit-3\n\n" +
                "C Programming language: C fundamentals, formatted input/ output, expressions,\n" +
                "selection statements, loops and their applications; Basic types, arrays, functions,\n" +
                "including recursive functions, program organization: local and external variables and\n" +
                "scope & arrays.\n" +
                "\n\nUnit-4\n\n" +
                "Strings: strings literals, string variables, I/O of strings, arrays of strings; applications.\n" +
                "Structures, Unions and Enumerations: Structure variables and operations on structures;\n" +
                "Structured types, nested array structures; unions; enumeration as integers, tags and\n" +
                "types. Standard library: Input / output; streams, file operations, formatted I/O, character\n" +
                "I/O, line I/O, block, string I/O, Library support for numbers and character data, error\n" +
                "handling:\n" +
                "\n\nText Books:\n\n" +
                "1. Using Information Technology, 5th Edi, Brian K Williams & Stacey C. Sawyer,\n" +
                "2003, TMH\n" +
                "2. The C Programming Language by Dennis M Ritchie, Brian W. Kernigham,\n" +
                "1988, PHI.\n" +
                "3. C Programming – A modern approach by K.N. King, 1996, WW Norton & Co");
    }



    }
