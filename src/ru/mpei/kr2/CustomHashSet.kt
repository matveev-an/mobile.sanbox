package ru.mpei.kr2

class CustomHashSet<T>() : HashSet<T>(), CustomSet<T> {

    constructor(other: Collection<T>) : this() {
        this.addAll(other)
    }

    override fun addition(other: CustomSet<T>): CustomSet<T> {
        return CustomHashSet(this).apply {
            addAll(other)
        }
    }

    override fun subtraction(other: CustomSet<T>): CustomSet<T> {
        return CustomHashSet(this).apply {
            removeAll(other)
        }
    }

    override fun intersection(other: CustomSet<T>): CustomSet<T> {
        return CustomHashSet(this).apply {
            retainAll(other)
        }
    }

}