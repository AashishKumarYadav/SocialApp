package com.example.social

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class SocialMedia : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_social_media)

        val webView = findViewById<WebView>(R.id.webViewPage)

        webViewSetUp(webView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(web: WebView){
        web.webViewClient = WebViewClient()

        web.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://aashishkumaryadav.github.io/DigitalCArd/")
        }
    }
}