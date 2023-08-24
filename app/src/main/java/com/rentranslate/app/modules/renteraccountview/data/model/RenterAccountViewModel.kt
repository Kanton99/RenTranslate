package com.rentranslate.app.modules.renteraccountview.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class RenterAccountViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_places)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameAndreaRo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_andrea_ro)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_language_itali)
  ,
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetCityOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_street_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetCityTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_street_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpace50mTwoOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_space_50m_2)

)
