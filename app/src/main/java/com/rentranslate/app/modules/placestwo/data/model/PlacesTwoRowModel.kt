package com.rentranslate.app.modules.placestwo.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class PlacesTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_street_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpace50mTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_space_50m_2)

)
