package com.example.rickyandmorty

import android.app.Application

class MortyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE =this
    }

    companion object {
        private var INSTANCE: MortyApp?=null
        fun getINSTANCE(): MortyApp {
            if(INSTANCE ==null){
                INSTANCE = MortyApp()
            }
            return INSTANCE!!
        }
    }
}