package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editname = findViewById<EditText>(R.id.editTextTextPersonName2)
        val editpass = findViewById<EditText>(R.id.editTextTextPassword2)
        val editmail = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val editnum  = findViewById<EditText>(R.id.editTextNumber2)
        val checkbox = findViewById<CheckBox>(R.id.checkBox2)
        val buttonAc = findViewById<Button>(R.id.button5)
        val textview = findViewById<TextView>(R.id.textView2)

        val name_check = findViewById<TextView>(R.id.name_check)
        val pass_check = findViewById<TextView>(R.id.pass_check)
        val mail_check = findViewById<TextView>(R.id.mail_check)
        val num_check  = findViewById<TextView>(R.id.num_check)
        val box_check  = findViewById<TextView>(R.id.box_check)



        buttonAc.setOnClickListener(){

            var name = editname.text.toString()
            var mail = editmail.text.toString()
            var num  = editnum.text.toString()
            var pass = editpass.text.toString()
            var check = checkbox.isChecked


            name_check.text = ""
            pass_check.text = ""
            mail_check.text = ""
            num_check.text  = ""
            box_check.text  = ""

            if (name == ""){
                textview.text = "name is empty"
                name_check.text = "Enter name !"

            }

            else if (pass == ""){
                textview.text = "Password is empty"
                pass_check.text = "Enter Password !"
            }

            else if (mail == ""){
                textview.text = "email is empty"
                mail_check.text = "Enter Email !"
            }

            else if (num == ""){
                textview.text = "Number is empty"
                num_check.text = "Enter Number !"
            }
            else{

                if (check){
                    textview.text = "Name: $name\nEmail: $mail\nNumber: $num\nPassword: $pass"
                }
                else {
                    textview.text = "Please accept the terms."
                    box_check.text = "Please read terms/Accept"

                }
            }


        }
    }
}
