package com.example.examapp05_08.theoryquestions

interface ICar {
    fun buildEngine()
}

abstract class Car(var iCar: ICar) : ICar {
    fun superBuilder() {
        iCar.buildEngine()
    }

    open fun addFar() {
    }
}

class BMW(iCar : ICar) : Car(iCar) {
    override fun buildEngine() {
        //
    }
    override fun addFar() {

    }
}

class Mercedes(iCar: ICar) : Car(iCar) {
    override fun buildEngine() {
        //
    }
}

class Kamaz(iCar: ICar) : Car(iCar) {
    override fun buildEngine() {
        //
    }
}