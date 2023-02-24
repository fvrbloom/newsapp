package com.example.tuimedaqandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val newsList: ArrayList<Users>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvHeading: TextView = itemView.findViewById(R.id.tv_heading)
        val tvSubHeading: TextView = itemView.findViewById(R.id.tv_subheading)
        val tvText: TextView = itemView.findViewById(R.id.tv_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.tvHeading.text = newsList[position].name
        holder.tvSubHeading.text = newsList[position].name
        holder.tvText.text = newsList[position].name
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}

