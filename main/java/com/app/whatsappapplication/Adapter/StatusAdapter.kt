package com.app.whatsappapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.whatsappapplication.databinding.ChatUiDesignBinding
import com.app.whatsappapplication.databinding.StatusUiDesignBinding
import com.app.whatsappapplication.model.StatusData

class StatusAdapter(var context:Context,var statuscategorylist:MutableList<StatusData>):RecyclerView.Adapter<StatusAdapter.MyViewHolder>() {
    lateinit var binding:StatusUiDesignBinding

    class MyViewHolder(var bind:StatusUiDesignBinding):RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       binding= StatusUiDesignBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)


    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var status =statuscategorylist[position]
        holder.bind.ivStatusimage.setImageResource(status.image)
        holder.bind.tvStatusTittle.text="${status.statustittle}"
        holder.bind.tvStausDes.text="${status.statustime}"

    }

    override fun getItemCount(): Int {
        return statuscategorylist.size
    }
}