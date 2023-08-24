package com.rentranslate.app.modules.placestwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rentranslate.app.R
import com.rentranslate.app.databinding.RowPlacesTwoBinding
import com.rentranslate.app.modules.placestwo.`data`.model.PlacesTwoRowModel
import kotlin.Int
import kotlin.collections.List

class PlacesTwoAdapter(
  var list: List<PlacesTwoRowModel>
) : RecyclerView.Adapter<PlacesTwoAdapter.RowPlacesTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPlacesTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_places_two,parent,false)
    return RowPlacesTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowPlacesTwoVH, position: Int) {
    val placesTwoRowModel = PlacesTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val placesTwoRowModel = list[position]
    holder.binding.placesTwoRowModel = placesTwoRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PlacesTwoRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PlacesTwoRowModel
    ) {
    }
  }

  inner class RowPlacesTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPlacesTwoBinding = RowPlacesTwoBinding.bind(itemView)
    init {
      binding.linearRentedplace.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PlacesTwoRowModel())
      }
    }
  }
}
