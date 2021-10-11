package com.example.googlemap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        NewSharedPrefrences(this).saveusername("KotlinAndroidAugBatch")
//        NewSharedPrefrences(this).saveUserType(1)
//        NewSharedPrefrences(this).saveUserStatus(true)
//
//        username.text=  NewSharedPrefrences(this).getUSername()
//        usertype.text= NewSharedPrefrences(this).getUSerStatus().toString()
//        userstatus.text= NewSharedPrefrences(this).getUSerType().toString()
//        NewSharedPrefrences(this).removusername()
//
//        refreshusername.text=NewSharedPrefrences(this).getUSername()
        Register.setOnClickListener{
            LoadFragment(RegisterFragment())
        }
        Login.setOnClickListener{
            LoadFragment(LoginFragment())
        }

    }

    private fun LoadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout,fragment).commit()
    }
}