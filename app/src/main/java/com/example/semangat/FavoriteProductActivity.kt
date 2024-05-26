package com.example.semangat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FavoriteProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favorite_product)
        val splashImageView = findViewById<ImageView>(R.id.left2)
        splashImageView.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}