package com.mutsanna.aplikasibangunruang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridBangunruangAdapter(val listBangunruang: ArrayList<Bangunruang>) : RecyclerView.Adapter<GridBangunruangAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_bangunruang, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
                .load(listBangunruang[position].photo)
                .apply(RequestOptions().override(450,550))
                .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listBangunruang.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}