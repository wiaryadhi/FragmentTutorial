package com.bcafinance.fragmenttutorial

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.textUserLog
import kotlinx.android.synthetic.main.fragment_login.textPassLog

class MainActivity : AppCompatActivity() {

    var orientation: Int = 0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            loadFragment(LoginFragment.newInstance("", ""))

//        btnRegistration.setOnClickListener(View.OnClickListener {
//            loadFragment(Registration.newInstance("",""))
//        })
        }
    }

    fun loadFragment(fragment: Fragment) {
        val fragManager = supportFragmentManager.beginTransaction()
        fragManager.replace(R.id.vFragment, fragment)
        fragManager.addToBackStack("")
        fragManager.commit()
    }


}