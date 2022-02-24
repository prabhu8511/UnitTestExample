package com.unittesting.circlecalc


import org.junit.Test

import com.google.common.truth.Truth.assertThat
import org.junit.Before

class MyCalcTest{
    private lateinit var myCalc: MyCalc

    @Before
    fun setUp() {
        myCalc = MyCalc()
    }

    @Test
    fun calculateCircumference_radiusGiven_returnCorrectResult(){
        myCalc = MyCalc()

        val result: Double = myCalc.calculateCircumference(2.1)

        assertThat(result).isEqualTo(13.188)

    }

    @Test
    fun calculateCircumference_zeroRadiusGiven_returnCorrectResult(){
        myCalc = MyCalc()

        val result: Double = myCalc.calculateCircumference(0.0)

        assertThat(result).isEqualTo(0.0)

    }

    @Test
    fun calculateArea_areaGiven_returnCorrectResult(){
        myCalc = MyCalc()

        val result: Double = myCalc.calculateArea(2.1)

        assertThat(result).isEqualTo(13.8474)

    }

    @Test
    fun calculateArea_zeroAreaGiven_returnCorrectResult(){
        myCalc = MyCalc()

        val result: Double = myCalc.calculateArea(0.0)

        assertThat(result).isEqualTo(0.0)

    }

}