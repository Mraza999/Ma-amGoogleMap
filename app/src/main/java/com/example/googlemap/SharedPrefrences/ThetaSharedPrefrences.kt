package com.example.googlemap.SharedPrefrences

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class ThetaSharedPrefrences(val context:Context) {

    private fun MyApplicationSP(): SharedPreferences? {
        val sharedprefrence=context.getSharedPreferences("Theta_Shared_preferences",MODE_PRIVATE)
        return sharedprefrence
    }
    fun saveUsername(username:String){
        MyApplicationSP()?.edit()?.putString("MyLoginUsername",username)?.apply()
    }

    fun getUsername() {
        MyApplicationSP()?.getString("MyLoginUsername","").toString()
}


}