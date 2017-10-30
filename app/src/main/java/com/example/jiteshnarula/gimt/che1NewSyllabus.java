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

public class che1NewSyllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(che1NewSyllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(che1NewSyllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(che1NewSyllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(che1NewSyllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(che1NewSyllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("Applied Chemistry");
        titleTextView.setText("Applied Chemistry");
        msgTextView.setText("\n\nUnit - I\n\n" +
                "Thermodynamics: First, second, third and zeroth law of thermodynamics, concept of\n" +
                "entropy (for reversible and irreversible process, of ideal gases, of phase transition), free\n" +
                "energy, work function, chemical potential, Gibb’s Helmholtz equation, Clausius-Clapeyron\n" +
                "equation and related numerical problems. Phase rule, terminology and derivation of Gibbs\n" +
                "phase rule, phase diagrams of water system, sulphur system, (Pb-Ag) system, (Zn-Mg)\n" +
                "system and (Na-K) system.\n" +
                "\n\nUnit - II\n\n" +
                "Water and its treatment: Hardness of water and its determination by EDTA, alkalinity and\n" +
                "its determination, related numerical problems, Scale and sludge formation (composition,\n" +
                "properties and methods of prevention), Water softening by ion exchange process, desalination\n" +
                "(reverse osmosis, electrodialysis)\n" +
                "Green Chemistry: Definition and concept, Twelve principles of green chemistry, Alternate\n" +
                "solvents-ionic liquids, super critical fluid (SCF) system, derivatized and immobilized solvent\n" +
                "materials.\n" +
                "\n\nUnit - III\n\n" +
                "Corrosion: Dry and Wet corrosion, electrochemical theory of corrosion, Pitting, water-line,\n" +
                "differential aeration and stress corrosion, factors affecting corrosion, preventive measures\n" +
                "(proper design and material selection, cathodic and anodic protection).\n" +
                "Lubricants: Mechanism of thin and thick layer lubrication, classification of lubricants and\n" +
                "important propertiers of lubricants (viscosity index, flash and fire point, saponification\n" +
                "number, pour point, iodine number,) Greases as lubricants: consistency and drop point test\n" +
                "\n\nUnit-IV\n\n" +
                "Engineering materials: Ceramics (brief introduction of clays, silica, feldspar, porcelain and\n" +
                "Vitreous Enamels), cement (introduction, raw materials, manufacture of portland cement,\n" +
                "analysis of cement) Nanoscale materials(introduction, properties of nanomaterials, brief\n" +
                "discussion of nanocrystals and clusters, fullerenes, carbon nanotubes, dendrimers, nano wires,\n" +
                "nanocomposites)\n" +
                "\n\nText Book\n\n" +
                "1. Rajesh Agnihotri, Engineering Chemistry, Wiley India Pvt. Ltd.");
    }
    }
