package com.example.testactivity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val key1 = "key"
        val data = intent?.getStringExtra(key1)
        var textv: TextView? = null
        textv = findViewById(R.id.textView3)



        textv.text = data

    }

}