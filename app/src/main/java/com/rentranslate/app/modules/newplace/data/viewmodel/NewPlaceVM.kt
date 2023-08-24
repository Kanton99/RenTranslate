package com.rentranslate.app.modules.newplace.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.newplace.`data`.model.NewPlaceModel
import org.koin.core.KoinComponent

class NewPlaceVM : ViewModel(), KoinComponent {
  val newPlaceModel: MutableLiveData<NewPlaceModel> = MutableLiveData(NewPlaceModel())

  var navArguments: Bundle? = null
}
