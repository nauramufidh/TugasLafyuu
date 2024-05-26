package com.example.semangat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product_detail)
        val splashImageView = findViewById<ImageView>(R.id.left4)
        splashImageView.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}