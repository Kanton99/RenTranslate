package com.rentranslate.app.modules.placestwo.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class PlacesTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_places)

)
