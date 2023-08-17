package com.example.social

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class ChatGPT : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_gpt)

        val webViewGPT = findViewById<WebView>(R.id.webPage)

        myWebViewSetUp(webViewGPT)
    }
    @RequiresApi(Build.VERSION_CODES.O)

     fun myWebViewSetUp(webPage: WebView) {
        webPage.webViewClient = WebViewClient()

        webPage.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://aashishkumaryadav.github.io/DigitalCArd/")
        }
    }
}