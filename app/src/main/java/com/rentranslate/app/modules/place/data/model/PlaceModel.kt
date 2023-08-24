package com.rentranslate.app.modules.place.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class PlaceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_place)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressStreet: String? =
      MyApp.getInstance().resources.getString(R.string.msg_address_street)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOwnerAndreaR: String? =
      MyApp.getInstance().resources.getString(R.string.msg_owner_andrea_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)

)
