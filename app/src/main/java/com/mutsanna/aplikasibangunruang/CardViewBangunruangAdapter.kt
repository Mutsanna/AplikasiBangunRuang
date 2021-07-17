package com.mutsanna.aplikasibangunruang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewBangunruangAdapter(private val listBangunruang: ArrayList<Bangunruang>) : RecyclerView.Adapter<CardViewBangunruangAdapter.CardViewViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_bangunruang, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewBangunruangAdapter.CardViewViewHolder, position: Int) {
        val bangunruang = listBangunruang[position]

        Glide.with(holder.itemView.context)
                .load(bangunruang.photo)
                .apply(RequestOptions().override(350, 550))
                .into(holder.imgPhoto)

        holder.tvName.text = bangunruang.name
        holder.tvDetail.text = bangunruang.detail

        holder.btnFavorite.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Favorite " + listBangunruang[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listBangunruang[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listBangunruang[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return listBangunruang.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.btn_set_favorite)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)

    }

}