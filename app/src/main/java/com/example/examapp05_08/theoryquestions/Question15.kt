package com.example.examapp05_08.theoryquestions

class House(addDecor : Boolean , addMebel : Boolean) {

    class Builder() {
        private var addDecor = false
        private var addMebel = false

        fun addSpoiler (addDecor: Boolean ) : Builder {
            this.addDecor= addDecor
            return this
        }
        fun addFuel ( addMebel: Boolean ) : Builder {
            this.addMebel = addMebel
            return this
        }
        fun build() : House {
            return House(addDecor = addDecor, addMebel = addMebel)
        }
    }
}

fun main() {
    var a  : House
    a = House().Builder().addMebel(true).build()
}