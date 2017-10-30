package com.example.jiteshnarula.gimt;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class Prospectus_ViewMore extends AppCompatActivity{

    ListView listView;
    ArrayList<ViewMore> arrayList;
    PDFView pdfView;
    TextView textView;

     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prospectus_viewmore_layout);

        listView = (ListView) findViewById(R.id.listView1);
         textView = (TextView) findViewById(R.id.textView);
         textView.setText("Prospectus");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Prospectus_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Prospectus_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Prospectus_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Prospectus_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });



         pdfView =  (PDFView) findViewById(R.id.pdfView);
         pdfView.fromAsset("brochure.pdf").load();



     }
}