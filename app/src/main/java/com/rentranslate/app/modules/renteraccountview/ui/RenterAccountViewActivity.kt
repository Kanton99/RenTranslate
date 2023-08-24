package com.rentranslate.app.modules.renteraccountview.ui

import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityRenterAccountViewBinding
import com.rentranslate.app.modules.place.ui.PlaceActivity
import com.rentranslate.app.modules.renteraccountview.`data`.viewmodel.RenterAccountViewVM
import kotlin.String
import kotlin.Unit

class RenterAccountViewActivity :
    BaseActivity<ActivityRenterAccountViewBinding>(R.layout.activity_renter_account_view) {
  private val viewModel: RenterAccountViewVM by viewModels<RenterAccountViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.renterAccountViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAppheader.setOnClickListener {
    }
    binding.linearRentedplace.setOnClickListener {
      val destIntent = PlaceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRentedplace1.setOnClickListener {
      val destIntent = PlaceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRentedplace2.setOnClickListener {
      val destIntent = PlaceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RENTER_ACCOUNT_VIEW_ACTIVITY"

  }
}
