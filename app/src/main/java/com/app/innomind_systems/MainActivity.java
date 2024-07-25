package com.app.innomind_systems;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        myWebView = (WebView) findViewById(R.id.my_webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setEnabled(true);
        myWebView.setBackgroundColor(getResources().getColor(android.R.color.white));

        myWebView.setWebViewClient(new WebViewClient());

        String url = "https://www.innomindssystems.com/";
        myWebView.loadUrl(url);
    }
}