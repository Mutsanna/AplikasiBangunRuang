package com.mutsanna.aplikasibangunruang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBangunruangAdapter(private val listBangunruang: ArrayList<Bangunruang>) : RecyclerView.Adapter<ListBangunruangAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_bangunruang, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bangunruang = listBangunruang[position]

        Glide.with(holder.itemView.context)
                .load(bangunruang.photo)
                .apply(RequestOptions().override(55,55))
                .into(holder.imgPhoto)

        holder.tvName.text = bangunruang.name
        holder.tvDetail.text = bangunruang.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listBangunruang[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listBangunruang.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Bangunruang)
    }
}