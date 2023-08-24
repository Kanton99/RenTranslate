package com.rentranslate.app.modules.newplace.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class NewPlaceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPlace: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_place)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressedit: String? = MyApp.getInstance().resources.getString(R.string.msg_address_edit)
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price2)

)
