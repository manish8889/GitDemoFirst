package com.nic.gitdemofirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    lateinit var editText1: EditText;
    lateinit var editText2: EditText;
    lateinit var strResult: TextView;

    lateinit var btnAdd: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        btnAdd = findViewById(R.id.buttonADD)
        strResult = findViewById(R.id.TextView_Result)

        buttonclear.setOnClickListener(){
            editText1.text.clear()
            editText2.text.clear()
            strResult.text=""


        }
        buttonSUB.setOnClickListener() {
            var strnum1: String = editText1.text.toString()
            var strnum2: String = editText2.text.toString()

            var sum: Int = strnum1.toInt() - strnum2.toInt()

            strResult.text = sum.toString()

        }
        buttonMUL.setOnClickListener() {
            var strnum1: String = editText1.text.toString()
            var strnum2: String = editText2.text.toString()

            var sum: Int = strnum1.toInt() * strnum2.toInt()

            strResult.text = sum.toString()

        }

        buttonDIV.setOnClickListener() {
            var strnum1: String = editText1.text.toString()
            var strnum2: String = editText2.text.toString()

            var sum: Int = strnum1.toInt() / strnum2.toInt()

            strResult.text = sum.toString()

        }


        btnAdd.setOnClickListener() {
            var strnum1: String = editText1.text.toString()
            var strnum2: String = editText2.text.toString()

            var sum: Int = strnum1.toInt() + strnum2.toInt()


            strResult.text = sum.toString()


        }


    }
}