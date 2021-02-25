package com.example.learnrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemListViewAdapter(val items: ArrayList<ItemData>): RecyclerView.Adapter<ItemListViewHolder>() {


    //Recycler view memanggil method ini setiap kali perlu membuat viewholder baru
    //metode ini membuat serta menginisiasi viewholder dan viewnya yang di distribusikan
    // tetapi tidak mengisi konten tampilan viewholder belum terikat dengan data tertentu
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,
            parent, false)
        return ItemListViewHolder(view)
    }
    //recycle view memanggil method ini untuk mendapatkan ukuran set data
    override fun getItemCount(): Int = items.size

    //Recycleview memanggil method ini untuk mendistribusikan viewholder dengan data
    //mengisi data ke layoutnya
    override fun onBindViewHolder(holder: ItemListViewHolder, position: Int) {
      val product = items.get(position)
        //bisa juga pake
        // val product = items[position]
        holder.bind(product)
    }

}