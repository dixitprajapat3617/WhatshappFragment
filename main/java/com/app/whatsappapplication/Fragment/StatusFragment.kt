package com.app.whatsappapplication.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.whatsappapplication.Adapter.StatusAdapter
import com.app.whatsappapplication.R
import com.app.whatsappapplication.databinding.FragmentStatusBinding
import com.app.whatsappapplication.model.StatusData

class StatusFragment : Fragment() {
    lateinit var sadapter:StatusAdapter
    lateinit var binding: FragmentStatusBinding
    private var statuslist= mutableListOf<StatusData>()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentStatusBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))
        statuslist.add(StatusData(1,"dixit prajapat","2 minutes ago",R.drawable.dixitprajapt))

        sadapter= StatusAdapter(requireContext(),statuslist)
        binding.statusRecyclerview.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.statusRecyclerview.adapter=sadapter





    }

}