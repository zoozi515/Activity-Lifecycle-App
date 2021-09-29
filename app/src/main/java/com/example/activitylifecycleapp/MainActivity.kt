package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "On Create")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Main", "On start state")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "On pause states")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "On resume states")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "On stop states")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "On destroy states")
    }
}