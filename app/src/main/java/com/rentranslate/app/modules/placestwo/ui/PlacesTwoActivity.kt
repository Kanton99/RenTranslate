package com.rentranslate.app.modules.placestwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityPlacesTwoBinding
import com.rentranslate.app.modules.place.ui.PlaceActivity
import com.rentranslate.app.modules.placestwo.`data`.model.PlacesTwoRowModel
import com.rentranslate.app.modules.placestwo.`data`.viewmodel.PlacesTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlacesTwoActivity : BaseActivity<ActivityPlacesTwoBinding>(R.layout.activity_places_two) {
  private val viewModel: PlacesTwoVM by viewModels<PlacesTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val placesTwoAdapter = PlacesTwoAdapter(viewModel.placesTwoList.value?:mutableListOf())
    binding.recyclerPlacesTwo.adapter = placesTwoAdapter
    placesTwoAdapter.setOnItemClickListener(
    object : PlacesTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PlacesTwoRowModel) {
        onClickRecyclerPlacesTwo(view, position, item)
      }
    }
    )
    viewModel.placesTwoList.observe(this) {
      placesTwoAdapter.updateData(it)
    }
    binding.placesTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFilter.setOnClickListener {
      toggleDrawer()
    }
  }

  private fun toggleDrawer(): Unit {
    if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
      binding.drawerLayout.openDrawer(GravityCompat.START)
    }
    else {
      binding.drawerLayout.closeDrawer(GravityCompat.START)
    }
  }

  fun onClickRecyclerPlacesTwo(
    view: View,
    position: Int,
    item: PlacesTwoRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRentedplace -> {
        onClickRecyclerPlacesTwoLinearRentedplace(view, position, item)
      }
    }
  }

  fun onClickRecyclerPlacesTwoLinearRentedplace(
    view: View,
    position: Int,
    item: PlacesTwoRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = PlaceActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = PlaceActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = PlaceActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = PlaceActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PLACES_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlacesTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
