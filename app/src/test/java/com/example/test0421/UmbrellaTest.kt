package com.example.test0421

import com.example.test0421.umbrella.IWeather
import com.example.test0421.umbrella.Umbrella
import io.mockk.coEvery
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class UmbrellaTest {
//    @Test
//    fun totalPrice() {
//        val umbrella = Umbrella()
//        val actual = umbrella.totalPrice(5, 200)
//        val expected = 900
//        Assert.assertEquals(expected, actual)
//    }

    @Test
    fun totalPrice_raining() {
        val umbrella = Umbrella()
        val stubWeather = StubWeather()
        stubWeather.fakeIsSunny = true
        val actual = umbrella.totalPrice(5, 200, stubWeather)
        val expected = 900
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun totalPrice_mockk_sunny() {
        val umbrella = Umbrella()
        val weather = mockk<IWeather>()
        coEvery { weather.isSunny() }returns true
        val actual = umbrella.totalPrice(5, 200, weather)
        val expected = 900
        Assert.assertEquals(expected, actual)
    }

}