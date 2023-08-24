package com.rentranslate.app.modules.placestwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.itemfilters.`data`.model.DrawerItemFiltersModel
import com.rentranslate.app.modules.placestwo.`data`.model.PlacesTwoModel
import com.rentranslate.app.modules.placestwo.`data`.model.PlacesTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PlacesTwoVM : ViewModel(), KoinComponent {
  val placesTwoModel: MutableLiveData<PlacesTwoModel> = MutableLiveData(PlacesTwoModel())

  var navArguments: Bundle? = null

  public var includedModel: MutableLiveData<DrawerItemFiltersModel> =
      MutableLiveData(DrawerItemFiltersModel())

  val placesTwoList: MutableLiveData<MutableList<PlacesTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
