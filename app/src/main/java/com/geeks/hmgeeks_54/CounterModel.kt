package com.geeks.hmgeeks_54

class CounterModel {

    private var _count = 0
    val count: Int
        get() = _count

    fun increment() {
        _count++
    }

    fun decrement() {
        _count--
    }

    fun getCount() = count

}