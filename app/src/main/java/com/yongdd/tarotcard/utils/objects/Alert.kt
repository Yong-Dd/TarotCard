package com.yongdd.tarotcard.utils.objects

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import android.widget.Toast
import androidx.core.view.isVisible
import com.yongdd.tarotcard.databinding.GetTextAlertBinding
import com.yongdd.tarotcard.databinding.SelectAlertBinding

object Alert {

    fun showAlertChoice(
        context: Context,
        title: String,
        message: String,
        leftText: String,
        rightText: String,
        left: () -> Unit,
        right: () -> Unit
    ) {
        val dlg = Dialog(context)
        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dlg.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val binding = SelectAlertBinding.inflate(LayoutInflater.from(context))
        dlg.setContentView(binding.root)

        binding.titleTV.text = title
        binding.bodyTV.hint = message
        binding.leftBtn.text = leftText
        binding.rightBtn.text = rightText

        binding.leftBtn.setOnClickListener {
            dlg.dismiss()
            left()
        }

        binding.rightBtn.setOnClickListener {
            dlg.dismiss()
            right()
        }
        dlg.setCancelable(true)
        dlg.show()
    }

    fun showAlert(
        context: Context,
        title: String,
        message: String,
        confirmText: String,
        confirm: () -> Unit
    ) {
        val dlg = Dialog(context)
        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dlg.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val binding = SelectAlertBinding.inflate(LayoutInflater.from(context))
        dlg.setContentView(binding.root)

        binding.titleTV.text = title
        binding.bodyTV.hint = message
        binding.leftBtn.isVisible = false
        binding.rightBtn.text = confirmText

        binding.rightBtn.setOnClickListener {
            dlg.dismiss()
            confirm()
        }
        dlg.setCancelable(true)
        dlg.show()
    }

    fun showGetTextAlert(
        context: Context,
        title: String,
        hintText:String,
        denyText: String,
        acceptText: String,
        deny: () -> Unit,
        accept: (String) -> Unit
    ) {
        val dlg = Dialog(context)
        dlg.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dlg.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val binding = GetTextAlertBinding.inflate(LayoutInflater.from(context))
        dlg.setContentView(binding.root)

        binding.titleTV.text = title
        binding.writeET.hint = hintText
        binding.leftBtn.text = denyText
        binding.rightBtn.text = acceptText

        binding.leftBtn.setOnClickListener {
            dlg.dismiss()
            deny()
        }

        binding.rightBtn.setOnClickListener {
            if(binding.writeET.text.isBlank()){
                Toast.makeText(context,"닉네임은 1글자 이상 작성해주세요 :(",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            dlg.dismiss()
            accept(binding.writeET.text.toString())
        }
        dlg.setCancelable(true)
        dlg.show()
    }

}