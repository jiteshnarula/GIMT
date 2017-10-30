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

public class phy1NewSyllabus extends AppCompatActivity {

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
                        Intent homeIntent = new Intent(phy1NewSyllabus.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(phy1NewSyllabus.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(phy1NewSyllabus.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(phy1NewSyllabus.this,SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        Intent locationIntent = new Intent(phy1NewSyllabus.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });

        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView msgTextView = (TextView) findViewById(R.id.msgTitle);
        TextView  coursesTextView = (TextView) findViewById(R.id. coursesTextView);

        coursesTextView.setText("Applied Physics-I");
        titleTextView.setText("Aapplied Physics-I");
        msgTextView.setText("\n\nUnit - I\n\n" +
                "Interference: Principle of Superposition, Conditions for interference, Division of wavefront:\n" +
                "Fresnel’s Biprism and Applications, Division of amplitude: Wedge-shaped film,\n" +
                "Newton’s rings, Michelson Interferometer and Applications.\n" +
                "Diffraction: Types of diffraction, Fraunhofer diffraction at a single slit, Plane transmission\n" +
                "diffraction grating: theory, secondary maxima and minima, width of principal maxima, absent\n" +
                "spectra, overlapping of spectral lines, determination of wavelength; Dispersive power and\n" +
                "resolving power of diffraction grating.\n" +
                "\n\nUnit – II\n\n" +
                "Polarization: Polarization of transverse waves, Plane of polarization, Polarization by\n" +
                "reflection, Double refraction, Nicol Prism, Quarter and half wave plate, Specific Rotation,\n" +
                "Laurent ‘s half shade polarimeter, Biquartz polarimeter.\n" +
                "Laser: Introduction, Stimulated Absorption, Spontaneous and Stimulated Emission;\n" +
                "Einstein’s Coefficients and its derivation, Population Inversion, Direct and Indirect pumping,\n" +
                "Pumping schemes, Main components of Laser, He-Ne Laser, Semiconductor Laser,\n" +
                "Characteristics of Laser, Applications of Laser.\n" +
                "\n\nUnit – III\n\n" +
                "Optical Fiber: Introduction, Principle of propagation of light waves in optical fibers: total\n" +
                "internal reflection, acceptance angle, numerical aperture, V- number; Modes of propagation,\n" +
                "Types of optical fibers: single mode fiber, multimode fibers; Fiber optics communication\n" +
                "system, Advantages of optical fiber communication, Applications of optical fibers.\n" +
                "Ultrasonics: Ultrasonic waves, Properties of ultrasonic waves, Production of ultrasonic\n" +
                "waves: Magnetostriction and Piezoelectric methods, Detection of ultrasonic waves,\n" +
                "Measurement of velocity of ultrasonic waves, Applications of ultrasonic waves.\n" +
                "2\n" +
                "\n\nUnit - IV\n\n" +
                "Special theory of Relativity: Concept of ether, Michelson-Morley experiment, Postulates of\n" +
                "Special theory of relativity, Frame of reference, Galilean Transformations, Lorentz\n" +
                "transformations, Consequences of Lorentz Transformations: Length contraction, Time\n" +
                "dilation; Velocity transformations, Variation of mass with velocity, Einstein’s mass-energy\n" +
                "relation, Einstein’s energy-momentum relation.\n" +
                "Nuclear Radiation and Detection: Classification of nuclear radiations, Interaction of\n" +
                "charged particle (light and heavy) and gamma radiations with matter (basic concepts); Gasfilled\n" +
                "detector: Ionization Chamber, Proportional Counter, Geiger Muller Counter;\n" +
                "Scintillation Detector, Semiconductor Detector.\n" +
                "\n\n" +
                "\n\nText Books\n\n" +
                "\n1. P.K. Diwan, Applied Physics for Engineers, Wiley India Pvt. Ltd.\n" +
                "2. S.P. Taneja, Modern Physics for Engineers, R. Chand & Co.");
    }



    }
