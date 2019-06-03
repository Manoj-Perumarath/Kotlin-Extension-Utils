package com.manoj.kotlin_extended

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.os.Bundle

inline fun <reified T : Any> Activity.launchActivityAndFinish() {
    val intent = newIntent<T>(this)
    startActivity(intent)
    finish()
}

inline fun <reified T : Any> Context.launchActivity(options: Bundle? = null, noinline init: Intent.() -> Unit = {}) {
    val intent = newIntent<T>(this)
    intent.init()
    startActivity(intent, options)
}

/*inline fun <reified T : Activity> Context.startA(vararg params: Pair<String, Any>) {
    val intent = newIntent<T>(context = this, bundle = params)
    intent.init()
    startActivity(intent, options)
}*/

inline fun <reified T : Any> newIntent(context: Context, bundle: Array<out Pair<String, Any?>>? = null): Intent {
    val i = Intent(context, T::class.java)
    return i
}