package com.rentranslate.app.modules.chats.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rentranslate.app.modules.chats.`data`.model.ChatsModel
import org.koin.core.KoinComponent

class ChatsVM : ViewModel(), KoinComponent {
  val chatsModel: MutableLiveData<ChatsModel> = MutableLiveData(ChatsModel())

  var navArguments: Bundle? = null
}
