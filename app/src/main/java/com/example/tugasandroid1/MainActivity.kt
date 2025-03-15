package com.example.tugasandroid1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorInput = findViewById<EditText>(R.id.colorInput)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val colorBox = findViewById<View>(R.id.colorBox)

        val colorMap = mapOf(
            "merah" to Color.RED,
            "biru" to Color.BLUE,
            "hijau" to Color.GREEN,
            "kuning" to Color.YELLOW,
            "hitam" to Color.BLACK,
            "putih" to Color.WHITE,
            "abu-abu" to Color.GRAY,
            "ungu" to Color.MAGENTA,
            "cyan" to Color.CYAN
        )

        submitButton.setOnClickListener {
            val colorName = colorInput.text.toString().trim().lowercase()

            if (colorMap.containsKey(colorName)) {
                colorBox.setBackgroundColor(colorMap[colorName]!!)
                colorBox.visibility = View.VISIBLE // Menampilkan kotak warna
            } else {
                Toast.makeText(this, "Warna tidak dikenali!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
