package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnstart : Button =findViewById(R.id.btn_start)
        var etname: EditText =findViewById(R.id.et_name)

        btnstart.setOnClickListener {

            if(etname.text.isEmpty())
            {
                Toast.makeText(
                    this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent= Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etname.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}