package com.rentranslate.app.modules.chatview.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class ChatViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_andrea_rossi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPuoivenireav: String? =
      MyApp.getInstance().resources.getString(R.string.msg_puoi_venire_a_v)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucancometo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_come_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFour: String? = MyApp.getInstance().resources.getString(R.string.msg_ok_i_ll_be_the)

)
