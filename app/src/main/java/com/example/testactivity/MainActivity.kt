package com.example.testactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val key1 = "key"
    var btnLOL: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLOL = findViewById(R.id.buttonAct)
        btnLOL?.setOnClickListener {

            var value = findViewById(R.id.editTextTextPersonName) as EditText
            var textv: String = value.editableText.toString()

            val data = Intent(this, SecondActivity::class.java).apply {
                putExtra(key1, textv)
            }
            startActivity(data)
        }
    }

}