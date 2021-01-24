package com.pabelpm.punkapibeer.domain.mappers

abstract class Mapper<S, T> {

    protected abstract fun map(source: S): T

    fun transform(source: S): T =
        try {
            map(source)
        } catch (exception: Exception) {
            throw Exception()
        }

    fun listTransform(source: List<S>): List<T> =
        try {
            val items = mutableListOf<T>()
            source.forEach { itemDto ->
                transform(itemDto)?.let { masterData ->
                    items.add(masterData)
                }
            }
            items
        } catch (exception: java.lang.Exception) {
            throw Exception()
        }
}