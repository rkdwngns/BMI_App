package sungil.mybmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultButton: Button = findViewById(R.id.resultButton)
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
    }
}