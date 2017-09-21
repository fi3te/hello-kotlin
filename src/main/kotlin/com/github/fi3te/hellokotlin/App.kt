package com.github.fi3te.hellokotlin

fun main(args: Array<String>) {
	println("Hello Kotlin!")
	println(getNumber())
	println(Device.create())
}

fun getNumber() = 42