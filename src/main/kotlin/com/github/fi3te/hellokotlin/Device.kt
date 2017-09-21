package com.github.fi3te.hellokotlin

import java.time.LocalDate
import java.util.*

data class Device(val id: String, val productionDate: LocalDate, var label: String) {

	companion object Factory {
		fun create(): Device = Device(UUID.randomUUID().toString(), LocalDate.now(), "New Device")
	}

}