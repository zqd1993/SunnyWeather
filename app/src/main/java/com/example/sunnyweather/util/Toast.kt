package com.example.sunnyweather.util

import android.content.Context
import android.widget.Toast

/**
 * @author qiandong
 * @Title: Toast.kt
 * @Description:
 * @date 2020/7/17
 */

fun String.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, this, duration).show()
}

fun Int.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, this, duration).show()
}