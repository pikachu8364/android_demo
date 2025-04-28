package com.example.test0421

class StubWeather : IWeather {
    var fakeIsSunny = false
    override fun isSunny(): Boolean {
        return fakeIsSunny
    }
}