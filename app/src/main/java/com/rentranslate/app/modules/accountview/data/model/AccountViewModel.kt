package com.rentranslate.app.modules.accountview.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class AccountViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNameAntonVol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_anton_vol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_language_engli)

)
