package com.nic.gitdemofirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    lateinit var strName: TextView;
    lateinit var strEmail: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        strName = findViewById(R.id.strName)
        strEmail = findViewById(R.id.strEmail);
        var name = intent.getStringExtra("name");
        var email = intent.getStringExtra("email");
        strName.setText(name)
        strEmail.setText(email)
        btn.setOnClickListener() {
            intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }
}