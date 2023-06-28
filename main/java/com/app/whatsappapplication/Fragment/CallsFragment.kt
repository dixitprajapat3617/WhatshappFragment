package com.app.whatsappapplication.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.whatsappapplication.Adapter.CallAdapter
import com.app.whatsappapplication.Adapter.ChatAdapter
import com.app.whatsappapplication.R
import com.app.whatsappapplication.databinding.FragmentCallsBinding
import com.app.whatsappapplication.model.CallData


class CallsFragment :Fragment() {

    lateinit var cadapter:CallAdapter



    lateinit var binding: FragmentCallsBinding
    private val calllist= mutableListOf<CallData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCallsBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))
        calllist.add(CallData(1,"dixit prajapat","(2) yesterday,9.27 pm",R.drawable.dixitprajapt,R.drawable.ic_baseline_videocam_24))



        cadapter= CallAdapter(requireContext(),calllist)
        binding.callsRecyclerview.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        binding.callsRecyclerview.adapter=cadapter



    }


}


