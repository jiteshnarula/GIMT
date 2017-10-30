package com.example.jiteshnarula.gimt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

/**
 * Created by Jitesh Narula on 16-10-2017.
 */

public class Regular_Result_Fragment extends Fragment {
    WebView webView;
    WebSettings webSettings;

    String myUrl="http://results.kuk.ac.in/result.php";
    String errorUrl = "file:///android_asset/mypage_error/index.html";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.regular_result_layout, container, false);
        webView = (WebView) view.findViewById(R.id.webView);

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


        return view;
    }
}

