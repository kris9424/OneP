package com.example.myapplication

open class Animal(
    val name: String,
    val collour: String,
) {
    open fun printAnimal(){
        println("name animal $name, his collour $collour")
    }
}