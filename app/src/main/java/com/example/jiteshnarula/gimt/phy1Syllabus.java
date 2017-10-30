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

public class phy1Syllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(phy1Syllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(phy1Syllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(phy1Syllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(phy1Syllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(phy1Syllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("PHYSICS-I  ");
        titleTextView.setText("PHYSICS-I  ");
        msgTextView.setText("\n\nUNIT-I\n\n" +
                "PHYSICAL OPTICS\n" +
                "Interference: Division of wave front-Fresnel's biprism, Division of amplitude–Newton's\n" +
                "rings, Michelson interferometer, applications.\n" +
                "Diffraction: Difference between Fraunhofer and Fresnel diffraction. Fraunhofer\n" +
                "diffraction through a slit. Plane transmission diffraction grating, its dispersive and\n" +
                "resolving powers.\n" +
                "Polarization: Polarised and unpolarized light, double refraction; Nicol prism, quarter\n" +
                "and half wave plates, Polarimetry; Biquartz and Laurent's half-shade polarimeters,\n" +
                "Simple concepts of photoelasticity.\n" +
                "\n\nUNIT-II\n\n" +
                "LASER: Spontaneous and stimulated emissions, Laser action, characteristics of laser\n" +
                "beam-concepts of coherence, He-Ne and semiconductor lasers (simple ideas),\n" +
                "applications.\n" +
                "FIBRE OPTICS: Propagation of light in fibres, numerical aperture, single mode and\n" +
                "multi mode fibres, applications.\n" +
                "\n\nUNIT-III\n\n" +
                "WAVE AND OSCILLATIONS: Simple concepts of Harmonic Oscillator, resonance,\n" +
                "quality factor. E.M. wave theory-review of basic ideas, Maxwell's equations, simple plane\n" +
                "wave equations, simple concepts of wave guides and co-axial cables, Poynting vector.\n" +
                "DIELECTRICS: Molecular theory, polarization, displacement, susceptibility, dielectric\n" +
                "coefficient, permitivity & various relations between these, Gauss's law in the presence of a\n" +
                "dielectric, Energy stored in an electric field. Behavior of dielectrics in a.c. field-simple\n" +
                "concepts, dielectric losses.\n" +
                "\n\nUNIT-IV\n\n" +
                "SPECIAL THEORY OF RELATIVITY: Michelson-Moreley experiment, Lorentz\n" +
                "transformations, variation of mass with velocity, mass energy equivalence.\n" +
                "NUCLEAR PHYSICS: Neutron Cross-section, Nuclear fission, Moderators, Nuclear\n" +
                "reactors, Reactor criticality, Nuclear fusion. Interaction of radiation with matter-basic\n" +
                "concepts, radiation detectors-ionisation chamber, G.M. Counter, Scintillation and solid\n" +
                "state detectors, cloud chamber and bubble chamber.\n" +
                "\n\nTEXT BOOKS:\n\n" +
                "1. Physics of the Atom - Wehr, Richards & Adair (Narosa)\n" +
                "2. Perspectives of Modern Physics - Arthur Beiser (TMH)\n" +
                "3. Modern Engineering Physics – A.S. Vasudeva (S. Chand)");
    }



    }
