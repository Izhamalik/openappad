package com.izhar.technical.openappad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MyApplication.OnShowAdCompleteListener {
    private lateinit var myApplication: MyApplication

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myApplication = application as MyApplication
        loadAd()
    }

    private fun loadAd() {
        myApplication.appOpenAdManager.loadAd(this)
    }

    private fun showAdIfAvailable() {
        myApplication.appOpenAdManager.showAdIfAvailable(this, this)
    }

    override fun onShowAdComplete() {

    }

    override fun onResume() {
        super.onResume()
        showAdIfAvailable()
    }
}
