package com.example.healthcalender;

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.healthcalender.databinding.ItemViewBinding

class Adapter : RecyclerView.Adapter<Holder>(){
    var listData = mutableListOf<Member>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding, parent)
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val member = listData[position]
        holder.setData(member)
    }
    override fun getItemCount(): Int {
        return listData.size
    }
}
class Holder(val binding: ItemViewBinding, val parent:ViewGroup ) : RecyclerView.ViewHolder(binding.root){
    fun setData(member: Member){
        print(member.name)

        binding.txtUserId.text = member.name

        binding.txtUserId.setOnClickListener {
            val intent = Intent(parent.context, ExerActivity::class.java)
            intent.putExtra("member", member)
            parent.context.startActivity(intent)
        }
    }
}
