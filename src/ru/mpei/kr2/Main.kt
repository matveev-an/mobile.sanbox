package ru.mpei.kr2

fun main() {
    println("TEST")

    val set1 = CustomHashSet(listOf(2.0,5.0,30.0))
    val set2 = CustomHashSet(listOf(2.0, 30.0, 45.0))

    assert(set1.addition(set2).containsAll(listOf(2.0, 5.0, 30.0, 45.0)))
    assert(set1.subtraction(set2).size == 1)
    assert(set1.subtraction(set2).contains(5.0))
    assert(set1.intersection(set2).containsAll(listOf(2.0, 30.0)))
    assert(set1.intersection(set2).size == 2)
    println("OK")
    assert(set1.addition(set2).contains(40.0))
}