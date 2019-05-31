package com.manoj.kotlin_extended

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes


fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    showToast(this, message, length)
}

fun Context.toast(@StringRes messageRes: Int = Toast.LENGTH_SHORT, length: Int) {
    showToast(this, getString(messageRes), length)
}

private fun showToast(context: Context, message: String, length: Int) {
    Toast.makeText(context, message, length).apply { show() }
}
