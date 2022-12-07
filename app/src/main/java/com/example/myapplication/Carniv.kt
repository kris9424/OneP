package com.example.myapplication

class Carniv (
    name: String,
    collour: String,
    internal val klass: String
    ): Animal(name, collour) {
        overrid fun printAnimal(){
            println("name animal $name, his collour $collour", $klass")
        }

    private fun println(s: String, any: Any?) {

    }

}