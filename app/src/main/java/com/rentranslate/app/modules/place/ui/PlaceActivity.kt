package com.rentranslate.app.modules.place.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityPlaceBinding
import com.rentranslate.app.modules.chatview.ui.ChatViewActivity
import com.rentranslate.app.modules.imageview.ui.ImageViewActivity
import com.rentranslate.app.modules.place.`data`.viewmodel.PlaceVM
import kotlin.String
import kotlin.Unit

class PlaceActivity : BaseActivity<ActivityPlaceBinding>(R.layout.activity_place) {
  private val viewModel: PlaceVM by viewModels<PlaceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.placeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAppheader.setOnClickListener {
    }
    binding.btnContact.setOnClickListener {
      val destIntent = ChatViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImgOne.setOnClickListener {
      val destIntent = ImageViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageImgOneOne.setOnClickListener {
      val destIntent = ImageViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PLACE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlaceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
