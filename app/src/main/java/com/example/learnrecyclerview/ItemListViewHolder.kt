package com.example.learnrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemListViewHolder(val view: View) :RecyclerView.ViewHolder(view) {

//    val binding = LayoutRecycleViewBiding.bind(view)

    fun bind(itemData: ItemData) {
//        binding.apply { itemNameTextView.setText(itemData.nama)
//        }

        val itemName = view.findViewById<TextView>(R.id.tvItemName)
        val itemCategory = view.findViewById<TextView>(R.id.tvItemCategory)
        val itemQuantity = view.findViewById<TextView>(R.id.tvItemQuantity)


        itemName.setText(itemData.name)
        itemCategory.setText(itemData.category)
        itemQuantity.setText(itemData.quantity.toString())
    }
}