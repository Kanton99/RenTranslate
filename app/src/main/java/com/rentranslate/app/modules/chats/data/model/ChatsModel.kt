package com.rentranslate.app.modules.chats.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_chats)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndreaRossi: String? = MyApp.getInstance().resources.getString(R.string.lbl_andrea_rossi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOkIllbethe: String? = MyApp.getInstance().resources.getString(R.string.msg_ok_i_ll_be_the2)

)
