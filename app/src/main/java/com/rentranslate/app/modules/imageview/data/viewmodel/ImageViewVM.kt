package com.rentranslate.app.modules.imageview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.imageview.`data`.model.ImageViewModel
import org.koin.core.KoinComponent

class ImageViewVM : ViewModel(), KoinComponent {
  val imageViewModel: MutableLiveData<ImageViewModel> = MutableLiveData(ImageViewModel())

  var navArguments: Bundle? = null
}
