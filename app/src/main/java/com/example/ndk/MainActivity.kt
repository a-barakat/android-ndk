package com.example.ndk

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ndk.KeysRetriever.getFacebookApiKey

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(findViewById<TextView>(R.id.apiKey)) {
            text = KeysRetriever.getKhyalPrivateNumber()
        }
    }
}