package com.app.whatsappapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.whatsappapplication.databinding.ActivityValidationBinding

class OnBordingFirstPageActivity : AppCompatActivity() {
    lateinit var binding: ActivityValidationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityValidationBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}