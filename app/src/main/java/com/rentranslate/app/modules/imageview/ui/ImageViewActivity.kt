package com.rentranslate.app.modules.imageview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityImageViewBinding
import com.rentranslate.app.modules.imageview.`data`.viewmodel.ImageViewVM
import kotlin.String
import kotlin.Unit

class ImageViewActivity : BaseActivity<ActivityImageViewBinding>(R.layout.activity_image_view) {
  private val viewModel: ImageViewVM by viewModels<ImageViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.imageViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IMAGE_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ImageViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
