package com.example.amebo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    val mAuth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginbtn = findViewById<Button>(R.id.LoginBtn)
        loginbtn.setOnClickListener { View.OnClickListener { view -> login() } }

    }
    private fun login() {
        val emailEdit = findViewById<View>(R.id.editText2)
        val passwdEdit = findViewById<View>(R.id.password)
        val email = emailEdit.text.toString()
        val password = passwdEdit.text.toString()
    }
}
