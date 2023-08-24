package com.rentranslate.app.modules.splash.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRT: String? = MyApp.getInstance().resources.getString(R.string.lbl_rt)

)
