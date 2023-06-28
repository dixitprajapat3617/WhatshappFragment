package com.app.whatsappapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.app.whatsappapplication.Adapter.ChatAdapter
import com.app.whatsappapplication.Adapter.ViewPagerAdapter
import com.app.whatsappapplication.Fragment.ChatsFragment
import com.app.whatsappapplication.databinding.ActivityHomePageBinding
import com.app.whatsappapplication.model.ChatData
import com.google.android.material.tabs.TabLayoutMediator

class HomePageActivity : AppCompatActivity() {



    lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolBar)

        val tablayout = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager2.adapter = tablayout

        var viewPager = binding.viewPager2
        //for binding floating button
        var fab = binding.folatingButton

        //for binding viewpager and floating button
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        fab.visibility = View.GONE

                    }
                    1 -> {
                        fab.setImageResource(R.drawable.ic_baseline_message_24)
                        fab.visibility = View.VISIBLE

                    }
                    2 -> {
                        fab.setImageResource(R.drawable.ic_baseline_photo_camera_24)
                        fab.visibility = View.VISIBLE

                    }
                    else -> {
                        fab.setImageResource(R.drawable.ic_baseline_add_ic_call_24)
                        fab.visibility = View.VISIBLE

                    }
                }
            }

        })
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, postion ->

            when (postion) {
                0 -> tab.setIcon(R.drawable.communities)

                1 -> tab.text = "Chats"
                2 -> tab.text = "Status"
                else -> tab.text = "Calls"
            }
        }.attach()

        binding.viewPager2.setCurrentItem(1,false)



    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.cemra -> {


                true
            }
            R.id.search -> {

                true
            }
            R.id.new_group -> {

                true
            }
            R.id.new_broadcast -> {

                true
            }
            R.id.Linked_device -> {

                true
            }
            R.id.payment -> {

                true
            }
            R.id.setting -> {

                true
            }


            else -> super.onOptionsItemSelected(item)
        }



    }

}




