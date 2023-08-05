package com.example.examapp05_08.theoryquestions

fun eliminator(array: IntArray): IntArray {
    array.sort()
    var k = 0
    for (i in array.indices) {
        if (i == 0 || array[i] != array[i - 1]) {
            array[k++] = array[i]
        }
    }
    return array.copyOf(k)
}

fun main() {
    val array: IntArray = intArrayOf(2, 4, 1, 2, 1, 2, 4, 5)
    val distinct = eliminator(array)
    println(distinct.contentToString())
}