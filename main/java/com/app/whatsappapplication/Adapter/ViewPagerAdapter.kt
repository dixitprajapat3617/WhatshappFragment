package com.app.whatsappapplication.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.app.whatsappapplication.Fragment.CallsFragment
import com.app.whatsappapplication.Fragment.ChatsFragment
import com.app.whatsappapplication.Fragment.CommiunitiesFragment
import com.app.whatsappapplication.Fragment.StatusFragment
import com.app.whatsappapplication.databinding.FragmentChatsBinding
import com.app.whatsappapplication.model.ChatData


private const val Num_Tab=4
class ViewPagerAdapter(manager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(manager,lifecycle) {

    override fun getItemCount(): Int {
            return Num_Tab
    }

    override fun createFragment(position: Int): Fragment {
            return when(position){
                0->CommiunitiesFragment()
                1->ChatsFragment()
                2->StatusFragment()

                else->CallsFragment()
            }

    }

}