package com.rentranslate.app.modules.chats.ui

import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityChatsBinding
import com.rentranslate.app.modules.chats.`data`.viewmodel.ChatsVM
import com.rentranslate.app.modules.chatview.ui.ChatViewActivity
import kotlin.String
import kotlin.Unit

class ChatsActivity : BaseActivity<ActivityChatsBinding>(R.layout.activity_chats) {
  private val viewModel: ChatsVM by viewModels<ChatsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAppheader.setOnClickListener {
    }
    binding.linearChatlink.setOnClickListener {
      val destIntent = ChatViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHATS_ACTIVITY"

  }
}
