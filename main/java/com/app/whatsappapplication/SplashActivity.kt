package com.app.whatsappapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.whatsappapplication.databinding.ActivitySplashBinding
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Thread({
            try {
                Thread.sleep(3000)
                var intent=Intent(this,HomePageActivity::class.java)
                startActivity(intent)
            }catch (e:Exception){
                e.printStackTrace()
            }
        }).start()
    }
}