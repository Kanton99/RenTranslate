package com.rentranslate.app.modules.itemmenu.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaces: String? = MyApp.getInstance().resources.getString(R.string.lbl_places)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChats: String? = MyApp.getInstance().resources.getString(R.string.lbl_chats)

)
