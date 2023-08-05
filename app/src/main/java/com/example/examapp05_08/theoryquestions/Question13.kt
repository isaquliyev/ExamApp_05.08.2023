package com.example.examapp05_08.theoryquestions

fun maxProduct(arr: IntArray, n: Int) {
    if (n < 2) {
        println("No pairs exists")
        return
    }

    var a = arr[0]
    var b = arr[1]

    for (i in 0 until n) for (j in i + 1 until n) if (arr[i] * arr[j] > a * b) {
        a = arr[i]
        b = arr[j]
    }
    println(
        "Max product pair is {" +
                a + ", " + b + "}"
    )
}

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 4, 3, 6, 7, 0)
    val n = arr.size
    maxProduct(arr, n)
}
