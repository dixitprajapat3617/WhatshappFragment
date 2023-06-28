package com.app.whatsappapplication.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.whatsappapplication.databinding.ChatUiDesignBinding
import com.app.whatsappapplication.model.ChatData

class ChatAdapter(var context: Context, var categoryview:MutableList<ChatData>):RecyclerView.Adapter<ChatAdapter.MyViewHolder>() {
    lateinit var binding: ChatUiDesignBinding

    class MyViewHolder(var bind:ChatUiDesignBinding):RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding=ChatUiDesignBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var name=categoryview[position]
        holder.bind.ivImage.setImageResource(name.image)
        holder.bind.tvTittle.text="${name.tittle}"
        holder.bind.tvTime.text="${name.time}"
        holder.bind.tvDes.text="${name.descriptoin}"
    }

    override fun getItemCount(): Int {
      return  categoryview.size

    }
}