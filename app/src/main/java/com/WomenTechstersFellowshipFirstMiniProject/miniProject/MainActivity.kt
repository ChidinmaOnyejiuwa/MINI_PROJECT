package com.WomenTechstersFellowshipFirstMiniProject.miniProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import com.WomenTechstersFellowshipFirstMiniProject.miniproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = this.findViewById(R.id.button)

        button.setOnClickListener{

            val intent = Intent(this, Button :: class.java)

            this.startActivity(intent)
        }
    }
}