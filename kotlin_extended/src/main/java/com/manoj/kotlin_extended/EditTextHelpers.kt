package com.manoj.kotlin_extended

import android.widget.EditText


fun EditText.isEmpty(): Boolean {
    return text.toString().isEmpty()
}

fun EditText.getTrimmedText(): String {
    return text.toString().trim()
}

fun EditText.getTextLength(): Int {
    return text.length
}

fun EditText.getTextInt(): Int? {
    return text.toString().toIntOrNull()
}

fun EditText.getTextFloat(): Float? {
    return text.toString().toFloatOrNull()
}

fun EditText.getTextDouble(): Double? {
    return text.toString().toDoubleOrNull()
}