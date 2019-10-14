package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //onCreate = main function

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //Display the UI. R = resources

        //TODO continue your work here
        //val = value, var = variable
        val buttonShowName : Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener(showName())
    }

    private fun showName(): View.OnClickListener? {
        textViewName.setText("Marven Lim")

    }
}
