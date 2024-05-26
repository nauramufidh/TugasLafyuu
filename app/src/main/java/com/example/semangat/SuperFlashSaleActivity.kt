package com.example.semangat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SuperFlashSaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_super_flash_sale)

        val imageView = findViewById<ImageView>(R.id.left)
        imageView.setOnClickListener {
            // Tindakan yang ingin dilakukan saat gambar diklik
            // Misalnya, pindah ke aktivitas lain
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}
