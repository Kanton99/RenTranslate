package com.rentranslate.app.modules.itemfilters.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemFiltersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaxPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_max_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpace: String? = MyApp.getInstance().resources.getString(R.string.lbl_space)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinbeds: String? = MyApp.getInstance().resources.getString(R.string.lbl_min_beds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRomeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var et50mTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOneValue: String? = null
)
