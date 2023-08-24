package com.rentranslate.app.modules.accountview.ui

import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.appcomponents.views.ImagePickerFragmentDialog
import com.rentranslate.app.databinding.ActivityAccountViewBinding
import com.rentranslate.app.modules.accountview.`data`.viewmodel.AccountViewVM
import kotlin.String
import kotlin.Unit

class AccountViewActivity : BaseActivity<ActivityAccountViewBinding>(R.layout.activity_account_view)
    {
  private val viewModel: AccountViewVM by viewModels<AccountViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageProfilePicture.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.linearAppheader.setOnClickListener {
      }
    }

    companion object {
      const val TAG: String = "ACCOUNT_VIEW_ACTIVITY"

    }
  }
