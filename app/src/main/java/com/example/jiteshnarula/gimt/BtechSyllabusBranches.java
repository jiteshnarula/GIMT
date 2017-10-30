package com.example.jiteshnarula.gimt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

/**
 * Created by Jitesh Narula on 18-10-2017.
 */

public class BtechSyllabusBranches extends AppCompatActivity {

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
        setContentView(R.layout.btech_syllabus_branches);

        radioButtonGroup = (RadioGroup) findViewById(R.id.radioButtonGroup);

        courseRelLay = (RelativeLayout) findViewById(R.id.courseRelLay);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:
                        Intent homeIntent = new Intent(BtechSyllabusBranches.this,MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(BtechSyllabusBranches.this,CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;
                    case R.id.result:
                        Intent resultIntent  = new Intent(BtechSyllabusBranches.this,ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                       break;
                    case R.id.location:
                        Intent locationIntent = new Intent(BtechSyllabusBranches.this,LocationActivity.class);
                        startActivity(locationIntent);
                        break;
                }
                return false;
            }
        });

    }


    public void radioButtonClicked(View view){
        int radioButtonId = radioButtonGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(radioButtonId);

        switch (radioButton.getId()){

            case R.id.cseRadioButton:
                Intent intent1= new Intent(BtechSyllabusBranches.this,CSESyllabusBranches.class);
                startActivity(intent1);
                break;

            case  R.id.meRadioButton:
                Intent intent2= new Intent(BtechSyllabusBranches.this,MESyllabusBranches.class);
                startActivity(intent2);
                break;
            case  R.id.ceRadioButton:
                Intent intent3= new Intent(BtechSyllabusBranches.this,CESyllabusBranches.class);
                startActivity(intent3);
                break;
            case R.id.eceRadioButton:
                Intent intent4 = new Intent(BtechSyllabusBranches.this,ECESyllabusBranches.class);
                startActivity(intent4);
                break;
            case  R.id.eeRadioButton:
                Intent intent5 = new Intent(BtechSyllabusBranches.this,EESyllabusBranches.class);
                startActivity(intent5);
                break;
        }
    }
}