package com.example.semangat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_layout)

        val splashTextView = findViewById<TextView>(R.id.textView7)
        splashTextView.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        val email = findViewById<TextInputEditText>(R.id.textInputEditText5)
        val password = findViewById<TextInputEditText>(R.id.textInputEditText2)
        val Login = findViewById<Button>(R.id.button)

        // Set up the login button click listener
        Login.setOnClickListener {
            // Get the email and password from the text fields
            val emailText = email.text.toString()
            val passwordText = password.text.toString()

            // Check if the email and password are correct
            if (emailText == "nauramufidah@gmail.com" && passwordText == "naura") {
                // Start the next activity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                // Show an error message
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}