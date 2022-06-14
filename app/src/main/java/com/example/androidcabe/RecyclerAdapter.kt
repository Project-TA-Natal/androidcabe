package com.example.androidcabe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private var titles = arrayOf("Chapter One","Chapter Two","Chapter Three","Chapter Four","Chapter Five",
        "Chapter Six","Chapter Seven","Chapter Eight")
    private var details =  arrayOf("Item One","Item Two","Item Three","Item Four","Item Five",
        "Item Six","Item Seven","Item Eight")
    private var images = intArrayOf(R.drawable.bg_homemonitoring,R.drawable.bg_homemonitoring,R.drawable.bg_homemonitoring,
            R.drawable.bg_homemonitoring,R.drawable.bg_homemonitoring,R.drawable.bg_homemonitoring,R.drawable.bg_homemonitoring,
            R.drawable.bg_homemonitoring)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false))

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text   = titles[position]
        holder.itemDetail.text  = details[position]
        holder.itemGambar.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }
    inner class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){
        var itemGambar  : ImageView
        var itemTitle   : TextView
        var itemDetail  : TextView

        init {
            itemGambar = itemView.findViewById(R.id.item_gambar)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

}