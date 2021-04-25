package me.katz.common

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.reduce

class Counter {
    private val _value = MutableValue(State())
    val state: Value<State> = _value

    fun increment() {
        _value.reduce { it.copy(count = it.count + 1) }
    }

    data class State(val count: Int = 0)
}