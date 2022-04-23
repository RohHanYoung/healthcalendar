package com.example.healthcalender;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.healthcalender.databinding.MyExerciseViewBinding

class MyExerciseRecyclerView {
    class Adapter : RecyclerView.Adapter<Holder>(){
        var listData = mutableListOf<Member>()
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            val binding = MyExerciseViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return Holder(binding)
        }
        override fun onBindViewHolder(holder: Holder, position: Int) {
            val member = listData[position]
            holder.setData(member)
            holder.itemView.setOnClickListener {
                itemClickListener.onClick(it, member, position)
            }
        }
        override fun getItemCount(): Int {
            return listData.size
        }

        interface OnItemClickListener {
            fun onClick(v: View, data: Member, position: Int)
        }

        fun setItemClickListener(onItemClickListener: OnItemClickListener) {
            this.itemClickListener = onItemClickListener
        }

        private lateinit var itemClickListener : OnItemClickListener
    }
    class Holder(private val binding: MyExerciseViewBinding) : RecyclerView.ViewHolder(binding.root){
        fun setData(member: Member){
            binding.txtUserId.text = member.name
        }
    }
}