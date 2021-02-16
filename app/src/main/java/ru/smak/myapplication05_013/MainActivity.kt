package ru.smak.myapplication05_013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnPress: Button
    lateinit var textView: TextView
    private var i = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPress = findViewById(R.id.btnPress)
        textView = findViewById(R.id.textView)
        btnPress.setOnClickListener {
            textView.text = getString(R.string.pressedText, ++i)
        }
    }
}