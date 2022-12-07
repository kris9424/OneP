package com.example.myapplication

class Herbiv (
    name: String,
    collour: String,
    internal val eating: String
): Animal(name, collour) {
    overrid fun printHerbiv()
    println("name animal $name, his collour $collour")
}