package com.rentranslate.app.modules.accountsettings.`data`.model

import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.di.MyApp
import kotlin.String

data class AccountSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountsetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)

)
