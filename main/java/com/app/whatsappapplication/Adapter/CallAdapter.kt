package com.app.whatsappapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.whatsappapplication.Fragment.CallsFragment
import com.app.whatsappapplication.databinding.CallUiDesignBinding
import com.app.whatsappapplication.model.CallData
import com.app.whatsappapplication.model.ChatData

class CallAdapter(var context:Context,var callcategorylist:MutableList<CallData>):RecyclerView.Adapter<CallAdapter.MyViewHolder>() {

    lateinit var binding: CallUiDesignBinding

    class MyViewHolder(var bind:CallUiDesignBinding):RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       binding= CallUiDesignBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var calls=callcategorylist[position]
        holder.bind.ivCallsImage.setImageResource(calls.callimage)
        holder.bind.cemraCallImage.setImageResource(calls.videoimage)
        holder.bind.tvCallsTittle.text="${calls.calltittle}"
        holder.bind.tvCallsDes.text="${calls.calldes}"

    }

    override fun getItemCount(): Int {
        return callcategorylist.size
    }
}