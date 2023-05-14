package com.yongdd.tarotcard.utils.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yongdd.tarotcard.databinding.ItemTarotBinding
import com.yongdd.tarotcard.model.data.Tarot
import com.yongdd.tarotcard.utils.enums.CardType
import com.yongdd.tarotcard.view.CardDetailActivity
import com.yongdd.tarotcard.viewmodel.CardDetailViewModel

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
                val context = binding.cardImg.context
                val intent = Intent(context,CardDetailActivity::class.java)
                intent.putExtra("cardDetailUrl",item.cardDetailImgUrl)
                intent.putExtra("cardOriginUrl",item.originCardImgUrl)
                context.startActivity(intent)
            }

        }
    }




}