package com.nic.gitdemofirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var text: TextView;
    lateinit var button: Button;
    lateinit var editText: EditText;
    lateinit var cleartext: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView4);
        cleartext = findViewById(R.id.textView5);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        cleartext.setOnClickListener() {
            editText.setText("");
            text.setText("");
        }

        button.setOnClickListener() {
            text.setText(editText.text.toString());
            Toast.makeText(applicationContext, "executed after change made over EditText", Toast.LENGTH_SHORT).show()

        }


    }
}
