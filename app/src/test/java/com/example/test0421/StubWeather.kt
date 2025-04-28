package com.example.test0421

import com.example.test0421.umbrella.IWeather

class StubWeather : IWeather {
    var fakeIsSunny = false
    override fun isSunny(): Boolean {
        return fakeIsSunny
    }
}