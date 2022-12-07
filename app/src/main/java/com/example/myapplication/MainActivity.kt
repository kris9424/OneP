package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carniv = Carniv($name "tiger", $collour "orange")
        val herbiv = Herbiv($name "goat", $collour "white")
        listOf(carniv, herbiv)
        carniv.printAnimal()
        herbiv.printAnimal()
