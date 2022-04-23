package com.example.healthcalender

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.healthcalender.databinding.ItemExerBinding

class ExerActivity : AppCompatActivity() {
   private lateinit var binding : ItemExerBinding

    override fun onCreate(savedInstantState: Bundle?){
        super.onCreate(savedInstantState)
        binding = ItemExerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("member")) {
            binding.textView3.text = (intent.getSerializableExtra("member") as Member).name
        }
   }
}