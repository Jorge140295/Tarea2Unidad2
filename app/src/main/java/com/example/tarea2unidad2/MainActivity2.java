package com.example.tarea2unidad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity2 extends AppCompatActivity {
     WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wv1=(WebView) findViewById(R.id.WebView);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://www.google.com/");
    }
}