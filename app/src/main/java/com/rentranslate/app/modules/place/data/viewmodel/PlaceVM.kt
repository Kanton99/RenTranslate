package com.rentranslate.app.modules.place.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.place.`data`.model.PlaceModel
import org.koin.core.KoinComponent

class PlaceVM : ViewModel(), KoinComponent {
  val placeModel: MutableLiveData<PlaceModel> = MutableLiveData(PlaceModel())

  var navArguments: Bundle? = null
}
