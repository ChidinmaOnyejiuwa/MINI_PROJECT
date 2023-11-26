package com.WomenTechstersFellowshipFirstMiniProject.miniProject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.WomenTechstersFellowshipFirstMiniProject.miniproject.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val button: Button = this.findViewById(R.id.button)

        button.setOnClickListener{

            val intent = Intent(this, Button :: class.java)

            this.startActivity(intent)
             }
    }
}