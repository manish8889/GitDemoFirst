package com.nic.gitdemofirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    lateinit var strName: TextView;
    lateinit var strEmail: TextView;
    lateinit var aa: ArrayAdapter<String>;

    val arr = arrayOf<String>(
        "C",
        "C++",
        "Java",
        ".Net",
        "Kotlin",
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "Php",
        "Ajax",
        "Perl",
        "Hadoop"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        strName = findViewById(R.id.strName)
        strEmail = findViewById(R.id.strEmail);
        aa = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        lv.adapter = aa;
        lv.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val element: String = adapterView.getItemAtPosition(i) as String//
            val pos = adapterView.getItemIdAtPosition(i)
// The item that was clicked
            Toast.makeText(
                applicationContext,
                "click item $element its position $pos",
                Toast.LENGTH_SHORT
            ).show()

        })


        var name = intent.getStringExtra("name");
        var email = intent.getStringExtra("email");
        strName.setText(name)
        strEmail.setText(email)
        btn.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}