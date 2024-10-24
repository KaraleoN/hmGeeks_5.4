package com.geeks.hmgeeks_54

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val model = CounterModel()
    val counterData = MutableLiveData<Int>().apply { value = model.getCount() }

    fun increment() {
        model.increment()
        counterData.value = model.getCount()
    }

    fun decrement() {
        model.decrement()
        counterData.value = model.getCount()
    }
}