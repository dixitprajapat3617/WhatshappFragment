package com.app.whatsappapplication.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.whatsappapplication.Adapter.ChatAdapter
import com.app.whatsappapplication.R
import com.app.whatsappapplication.databinding.FragmentChatsBinding
import com.app.whatsappapplication.model.ChatData


class ChatsFragment : Fragment() {
     lateinit var mdapter:ChatAdapter
    private var chatlist= mutableListOf<ChatData>()
    lateinit var binding: FragmentChatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatlist.add(ChatData(1,"Dixit prajapat","2.15 pm",R.drawable.dixitprajapt,"  kya kar rhe to,"))
        chatlist.add(ChatData(2,"yuvraj singh","4.05 pm",R.drawable.yuvraj,"  hyy,"))
        chatlist.add(ChatData(3,"Bitu,","yesterday",R.drawable.bitu,"  hii"))
        chatlist.add(ChatData(4,"Mukesh dewasi","11/03/23",R.drawable.avtar,"  ha"))
        chatlist.add(ChatData(5,"Papa ji","4.05 pm",R.drawable.avtar,"  hello"))
        chatlist.add(ChatData(6,"Mummu ji","yesterday",R.drawable.avtar,"  hii",))
        chatlist.add(ChatData(7,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(8,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(9,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(10,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))
        chatlist.add(ChatData(1,"23 Augest Android","4.05 pm",R.drawable.avtar,"  var descriptoin:String,"))



        mdapter=ChatAdapter(requireContext(),chatlist)
        binding.recyclerview.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.recyclerview.adapter=mdapter





    }


    }
