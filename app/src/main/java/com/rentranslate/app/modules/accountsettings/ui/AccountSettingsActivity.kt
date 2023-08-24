package com.rentranslate.app.modules.accountsettings.ui

import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityAccountSettingsBinding
import com.rentranslate.app.modules.accountsettings.`data`.viewmodel.AccountSettingsVM
import kotlin.String
import kotlin.Unit

class AccountSettingsActivity :
    BaseActivity<ActivityAccountSettingsBinding>(R.layout.activity_account_settings) {
  private val viewModel: AccountSettingsVM by viewModels<AccountSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_SETTINGS_ACTIVITY"

  }
}
