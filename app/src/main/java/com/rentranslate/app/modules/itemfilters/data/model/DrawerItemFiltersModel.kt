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
  var txtRome: String? = MyApp.getInstance().resources.getString(R.string.lbl_rome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaxPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_max_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_150)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpace: String? = MyApp.getInstance().resources.getString(R.string.lbl_space)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpaceValue: String? = MyApp.getInstance().resources.getString(R.string.lbl_50m2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinbeds: String? = MyApp.getInstance().resources.getString(R.string.lbl_min_beds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_set)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_remove)

)
