package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.WindowCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    //val context = MainActivity.appContext

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        binding.fab.setOnClickListener {
            snak("hello babar")

//            var intent=Intent(this,MainActivity2::class.java)
//            startActivity(intent)
        }
        binding.settext.text = "Hello Babar here"
        binding.settext.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("key","value")
            startActivity(intent)
        }

    }

    private fun snak(s: String) {
        val snackbar = Snackbar.make(
            binding.root, s,
            Snackbar.LENGTH_LONG
        ).setAction("Action", null)
        snackbar.show()
    }
}