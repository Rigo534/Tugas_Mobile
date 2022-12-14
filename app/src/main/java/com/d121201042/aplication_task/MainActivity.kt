package com.d121201042.aplication_task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.d121201042.aplication_task.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            val intent = Intent(this,AddActivity::class.java)
            startActivity(intent)
        }

        val navControll = findNavController(R.id.fragment)
        binding.bottomNavigationView.setupWithNavController(navControll)
    }
}
