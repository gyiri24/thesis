package com.example.aclass

class Car constructor(var plateNumber: String){

    var upperPlateNumber: String
    var egineNum = 0

    init {
        upperPlateNumber = plateNumber.toUpperCase()
    }

    constructor(aPlate: String, engineNum: Int) : this(aPlate){
        this.egineNum = engineNum
    }

    fun showPlateNumber(): String {
        return upperPlateNumber
    }

    fun showPlateAndEngine(): String {
        return "$upperPlateNumber, $egineNum"
    }
}