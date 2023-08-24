package com.rentranslate.app.modules.rentersplace.ui

import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityRenterSPlaceBinding
import com.rentranslate.app.modules.imageview.ui.ImageViewActivity
import com.rentranslate.app.modules.newplace.ui.NewPlaceActivity
import com.rentranslate.app.modules.rentersplace.`data`.viewmodel.RenterSPlaceVM
import kotlin.String
import kotlin.Unit

class RenterSPlaceActivity :
    BaseActivity<ActivityRenterSPlaceBinding>(R.layout.activity_renter_s_place) {
  private val viewModel: RenterSPlaceVM by viewModels<RenterSPlaceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.renterSPlaceVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImgOneOne.setOnClickListener {
      val destIntent = ImageViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImgOne.setOnClickListener {
      val destIntent = ImageViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEdit.setOnClickListener {
      val destIntent = NewPlaceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RENTER_S_PLACE_ACTIVITY"

  }
}
