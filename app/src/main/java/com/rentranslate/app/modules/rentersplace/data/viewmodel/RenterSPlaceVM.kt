package com.rentranslate.app.modules.rentersplace.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.rentersplace.`data`.model.RenterSPlaceModel
import org.koin.core.KoinComponent

class RenterSPlaceVM : ViewModel(), KoinComponent {
  val renterSPlaceModel: MutableLiveData<RenterSPlaceModel> = MutableLiveData(RenterSPlaceModel())

  var navArguments: Bundle? = null
}
