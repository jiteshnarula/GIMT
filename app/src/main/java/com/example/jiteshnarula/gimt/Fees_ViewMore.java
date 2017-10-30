package com.example.jiteshnarula.gimt;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Fees_ViewMore extends AppCompatActivity{


    WebView webView;

    String myUrl="https://ibb.co/fxiERR";
    String errorUrl = "file:///android_asset/mypage_error/index.html";
    ListView listView;
    ArrayList<ViewMore> arrayList;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fees_viewmore_layout);

         listView = (ListView) findViewById(R.id.listView1);
         ImageView imageView = (ImageView) findViewById(R.id.imageView);
         WebView webView = (WebView) findViewById(R.id.webView);
         TextView textView12 = (TextView) findViewById(R.id.textView12);
         TextView textView11 = (TextView) findViewById(R.id.textView11);
         TextView textView = (TextView) findViewById(R.id.textView);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Fees_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Fees_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Fees_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Fees_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });

         textView.setText("Fees Structure");

        imageView.setImageResource(R.drawable.fees_screenshot);
         PhotoViewAttacher photoView = new PhotoViewAttacher(imageView);
         photoView.update();

     }
}