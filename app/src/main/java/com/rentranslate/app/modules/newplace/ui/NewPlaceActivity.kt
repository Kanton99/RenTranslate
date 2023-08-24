package com.rentranslate.app.modules.newplace.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.appcomponents.views.ImagePickerFragmentDialog
import com.rentranslate.app.databinding.ActivityNewPlaceBinding
import com.rentranslate.app.modules.newplace.`data`.viewmodel.NewPlaceVM
import kotlin.String
import kotlin.Unit

class NewPlaceActivity : BaseActivity<ActivityNewPlaceBinding>(R.layout.activity_new_place) {
  private val viewModel: NewPlaceVM by viewModels<NewPlaceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.newPlaceVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imagePLus.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  companion object {
    const val TAG: String = "NEW_PLACE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewPlaceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
