package com.rentranslate.app.modules.renteraccountview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.renteraccountview.`data`.model.RenterAccountViewModel
import org.koin.core.KoinComponent

class RenterAccountViewVM : ViewModel(), KoinComponent {
  val renterAccountViewModel: MutableLiveData<RenterAccountViewModel> =
      MutableLiveData(RenterAccountViewModel())

  var navArguments: Bundle? = null
}
