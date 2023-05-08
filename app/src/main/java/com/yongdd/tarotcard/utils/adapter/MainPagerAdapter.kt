package com.yongdd.tarotcard.utils.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yongdd.tarotcard.databinding.ItemTarotBinding
import com.yongdd.tarotcard.model.data.Tarot
import com.yongdd.tarotcard.utils.enums.CardType

class MainPagerAdapter() : RecyclerView.Adapter<MainPagerAdapter.ViewHolder>() {

    var lists = mutableListOf<Tarot>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemTarotBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setItem(lists[position])
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    inner class ViewHolder(private val binding : ItemTarotBinding) : RecyclerView.ViewHolder(binding.root){

        fun setItem(item:Tarot){
            binding.cardImg.setImageDrawable(item.cardImg)
            binding.cardImg.setOnClickListener {
                Toast.makeText(binding.cardImg.context,"상세 개발 중입니다:D", Toast.LENGTH_SHORT).show()
            }

            // 메뉴 변경을 위해 전과 후에 다른 타입일 경우 itemChangeListener call
//            val beforeType = if(adapterPosition>0) lists[adapterPosition-1].type else item.type
//            val nextType = if(adapterPosition+1>lists.size) lists[adapterPosition+1].type else item.type
//            if(beforeType != item.type || nextType != item.type) {
//                itemChangeListener(adapterPosition,item.type)
//            }
        }
    }




}