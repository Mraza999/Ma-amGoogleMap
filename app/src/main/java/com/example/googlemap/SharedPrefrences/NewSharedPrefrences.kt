package com.example.googlemap.SharedPrefrences

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class NewSharedPrefrences(val context:Context){
    val sharedprefrence:SharedPreferences
    init{
        sharedprefrence=context.getSharedPreferences("New_SP", MODE_PRIVATE)
    }

    fun saveusername(username:String){
        sharedprefrence.edit().putString("ApplicationUser",username).apply()
    }
    //to clear specific key
    fun removusername(){
        sharedprefrence.edit().remove("ApplicationUser").apply()
    }
    fun saveUserType(userType:Int){
        sharedprefrence.edit().putInt("ApplicationUserType",userType).apply()
    }
    fun saveUserStatus(userStatus:Boolean){
        sharedprefrence.edit().putBoolean("ApplicationUserBoolean",userStatus).apply()
    }

    fun getUSername(): String? {
       return sharedprefrence.getString("ApplicationUser",null)
    }
    fun getUSerStatus(): Boolean {
        return sharedprefrence.getBoolean("ApplicationUserBoolean",false)
    }
    fun getUSerType(): Int {
        return sharedprefrence.getInt("ApplicationUserType",0)
    }
    //to clear all sharedprefrences
    fun clearSharedprefrence(){
        sharedprefrence.edit().clear().apply()
    }
}