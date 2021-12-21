package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = " "


        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.right_in, R.anim.left_out)
        }
        supportActionBar!!.addOnMenuVisibilityListener {
            if (it) background_dark.visibility = View.VISIBLE
            else background_dark.visibility = View.INVISIBLE
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_settings, menu)
        return super.onCreateOptionsMenu(menu)
    }
}