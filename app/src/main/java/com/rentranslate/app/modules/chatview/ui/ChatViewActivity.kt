package com.rentranslate.app.modules.chatview.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.rentranslate.app.R
import com.rentranslate.app.appcomponents.base.BaseActivity
import com.rentranslate.app.databinding.ActivityChatViewBinding
import com.rentranslate.app.modules.chatview.`data`.viewmodel.ChatViewVM
import kotlin.String
import kotlin.Unit

class ChatViewActivity : BaseActivity<ActivityChatViewBinding>(R.layout.activity_chat_view) {
  private val viewModel: ChatViewVM by viewModels<ChatViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chatViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHAT_VIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChatViewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
