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

public class bt1Syllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(bt1Syllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(bt1Syllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(bt1Syllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(bt1Syllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(bt1Syllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("INTRODUCTION TO BIOTECHNOLOGY");
        titleTextView.setText("INTRODUCTION TO BIOTECHNOLOGY");
        msgTextView.setText("\n\nUNIT - I\n\n" +
                "Introduction to life: Characteristics of living organisms. Hierarchy of organisation and\n" +
                "factors responsible for regulating different levels of organisations. Structure of Prokaryotic\n" +
                "and Kukaryotic cell. Basic concept of State and Homeostasis.\n" +
                "Introduction to Biomolecules: Definition, general classification and important functions of\n" +
                "carbohydrates, lipids, proteins, nucleic acids and vitamins.\n" +
                "Enzymes as biocatalysts: General characteristics, nomenclature and classification of\n" +
                "Enzymes. Effect of temperature, pH, enzyme and substrate concentrations on the activity of\n" +
                "enzymes. Elementary concept of cofactors and coenzymes.\n" +
                "\n\nUNIT - II\n\n" +
                "Biodiversity :\n" +
                "(i) Plant System : Basic concepts of plant growth, nutrition, photosynthesis and\n" +
                "nitrogen fixation. Types of Growth regulators and their physiological effects.\n" +
                "(ii) Animal System : Elementary Study of Digestive, Respiratory, Circulatory,\n" +
                "Excretory systems and their functions.\n" +
                "(iii) Microbial System : History of Microbiology, types of microbes and properties.\n" +
                "Economic importance and control of microbes.\n" +
                "\n\nUNIT - III\n\n" +
                "Evolution: Theories of evolution. Mendel’s laws of inheritance. Variation and speciation.\n" +
                "Genetic: Cell division – Mitosis and Meiosis. Evidence of nucleic acids as a genetic material.\n" +
                "Central Dogma.\n" +
                "Genetic Engineering : Elementary knowledge of Recombinant DNA Technology, Bioinformatics\n" +
                "and Genomics.\n" +
                "\n\nUNIT – IV\n\n" +
                "Introduction to Biotechnology : Definition, scope and achievements. Tools used in\n" +
                "biotechnology.\n" +
                "Applications of Biotechnology in Agriculture, Medicine and Environment – an\n" +
                "elementary knowledge.\n" +
                "Prospects and public perception of Biotechnology.\n" +
                "\n\nText/ Reference Books:\n\n" +
                "1. Cell Biology and Genetics. 9th edition. Starr, C. and Taggard; R. (2001) Thomson\n" +
                "Learning USA.\n" +
                "2. Life Science of Biology 6th edition Purves W.K.; Sadava, D.; Orians, G.H. and Heller,\n" +
                "H.C. (2001). W.H. Freeman & company, USA.\n" +
                "3. Basic Biotechnology. Ratledge, C. and Kristiansen, B. (2001) Cambridge University\n" +
                "Press.\n" +
                "4. Basic Biotechnology. Ignacimuthu, S.J. (2002) Tata McGraw-Hill Pub., New Delhi\n" +
                "5. Genes VII Lewis Benjamin (2002). Oxford Univ. Press Oxford.\n" +
                "6. Biotechnology 3rd Edition. Smith, J.E. (2003) Cambridge University Press");
    }



    }
