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

public class Transport_ViewMore extends AppCompatActivity{

    WebView webView;

    String myUrl="http://www.gimt.edu.in/transport-facility/";
    String errorUrl = "file:///android_asset/mypage_error/index.html";

    ListView listView;
    ArrayList<ViewMore> arrayList;
    TextView textView;
     @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transport_viewmore_layout);

         textView = (TextView) findViewById(R.id.textView);
         textView.setText("Transport Facility");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()) {
                    case R.id.home:
                        Intent homeIntent = new Intent(Transport_ViewMore.this, MainActivity.class);
                        startActivity(homeIntent);
                        break;
                    case R.id.courses:
                        Intent coursesIntent = new Intent(Transport_ViewMore.this, CoursesActivity.class);
                        startActivity(coursesIntent);
                        break;

                    case R.id.result:
                        Intent resultIntent = new Intent(Transport_ViewMore.this, ResultActivity.class);
                        startActivity(resultIntent);
                        break;
                    case R.id.syllabus:
                        Intent syllabusIntent = new Intent(Transport_ViewMore.this, SyllabusActivity.class);
                        startActivity(syllabusIntent);
                        break;
                    case R.id.location:
                        break;
                }
                return false;
            }
        });
         webView = (WebView) findViewById(R.id.webView);

         if(savedInstanceState != null){
             webView.restoreState(savedInstanceState);
         }else {

             webView.getSettings().setJavaScriptEnabled(true);
             webView.setFocusable(true);
             webView.setFocusableInTouchMode(true);
             webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
             webView.getSettings().setSupportZoom(true);
             webView.getSettings().setBuiltInZoomControls(true);
             webView.getSettings().setLoadWithOverviewMode(true);
             webView.getSettings().setUseWideViewPort(true);

             webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
             webView.getSettings().setDomStorageEnabled(true);
             webView.getSettings().setDatabaseEnabled(true);
             webView.getSettings().setAppCacheEnabled(true);
             webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
         }
         webView.loadUrl(myUrl);

         webView.setWebViewClient(new WebViewClient(){
             @Override
             public void onReceivedClientCertRequest(WebView view, ClientCertRequest request) {
                 super.onReceivedClientCertRequest(view, request);
             }
         });
     }
}