package com.majid.recyclerviewpratice

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.majid.recyclerviewpratice.databinding.ItemsBinding

class ItemAdapter(var list: ArrayList<String>) : RecyclerView.Adapter<ItemAdapter.Viewholder>() {
    class Viewholder(var view: View) : RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.tvNAme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.Viewholder {
        var v = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return Viewholder(v)
    }

    override fun onBindViewHolder(holder: ItemAdapter.Viewholder, position: Int) {
        holder.name.setText(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}