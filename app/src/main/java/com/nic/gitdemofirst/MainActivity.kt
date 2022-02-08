package com.nic.gitdemofirst

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var text: TextView;
    lateinit var button: Button;
    lateinit var buttonNext: Button;
    lateinit var editText: EditText;
    lateinit var cleartext: TextView;
    lateinit var btncalc: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView4);
        cleartext = findViewById(R.id.textView5);
        button = findViewById(R.id.button);
        buttonNext = findViewById(R.id.buttonNext);
        btncalc = findViewById(R.id.buttonCalc);

        editText = findViewById(R.id.editText);
        cleartext.setOnClickListener() {
            editText.setText("");
            text.setText("");
        }

        button.setOnClickListener() {
            text.setText(editText.text.toString());
            Toast.makeText(
                applicationContext,
                "executed after change made over EditText",
                Toast.LENGTH_SHORT
            ).show()

        }
        buttonNext.setOnClickListener() {
            var intent: Intent = Intent(this, SecondActivity::class.java);
            intent.putExtra("name", "Manish Kumar");
            intent.putExtra("email", "m.manishec@gmail.com");
            startActivity(intent)


        }

        btncalc.setOnClickListener() {

            var i: Intent = Intent(applicationContext, CalculatorActivity::class.java)
            startActivity(i)
        }


    }
}
