package com.example.keta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SignInActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btnIntent3 = findViewById(R.id.button5)
        btnIntent3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.button5 -> run {
                    val intent = Intent(this@SignInActivity, BottomNavigationActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}