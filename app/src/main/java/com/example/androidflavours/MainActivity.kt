package com.example.androidflavours

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("FLAVORR", BuildConfig.FLAVOR)
        Log.e("TYPEE", BuildConfig.TYPE)

        Log.e("VERSION_NAME", BuildConfig.VERSION_NAME)
        Log.e("DEBUG", BuildConfig.DEBUG.toString())

        Log.e("VERSION_CODE", BuildConfig.VERSION_CODE.toString())
        Log.e("BUILD_TYPE", BuildConfig.BUILD_TYPE)

        Log.e("APPLICATION_ID", BuildConfig.APPLICATION_ID)


    }
}
