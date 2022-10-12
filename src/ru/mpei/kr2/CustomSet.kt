package ru.mpei.kr2

// Создать абстрактный класс «множество» с методами пересечения, объединения, разности,
// добавление элементов (возможно через конструктор), вывода содержимого множества.
// Создать классы наследники множество рациональных чисел и строк.
// Создать объекты этих множеств и проверить операции с этими объектами (Kotlin)

interface CustomSet<T> : MutableSet<T> {

    fun addition(other: CustomSet<T>): CustomSet<T>
    fun subtraction(other: CustomSet<T>): CustomSet<T>
    fun intersection(other: CustomSet<T>): CustomSet<T>
}