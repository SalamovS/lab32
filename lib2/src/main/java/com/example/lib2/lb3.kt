package com.example.lib2

class lb3 {
    fun main() {
        // 1. Создать список целых чисел и добавить в него 10 элементов
        val list = mutableListOf(14, 3, 22, 8, 11, 40, 5, 9, 2, 17)
        println("Список из 10 элементов: $list")
        // 2. Удалить элемент из списка по индексу
        list.removeAt(0) // Удаляем элемент на позиции 0
        println("После удаления по индексу 0: $list")
        // 3. Найти среднее значение элементов списка
        println("Среднее значение: ${list.average()}")
        // 4. Проверить, пустой ли список
        println("Список пуст: ${list.isEmpty()}")
        // 5. Заменить элемент списка на другой
        list[1] = 99
        println("После замены элемента по индексу 1: $list")
        // 6. Перевести список строк в верхний регистр
        val words = listOf("kotlin", "android", "mobile")
        val upperWords = words.map { it.uppercase() }
        println("В верхнем регистре: $upperWords")
        // 7. Создать список чисел и удалить все чётные
        val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        numbers.removeAll { it % 2 == 0 }
        println("Без чётных: $numbers")
        // 8. Объединить два списка в один
        val list1 = listOf(1, 2, 3)
        val list2 = listOf(4, 5, 6)
        val combinedList = list1 + list2
        println("Объединённый список: $combinedList")
        // 9. Найти второй по величине элемент списка
        val sampleList = listOf(10, 45, 2, 99, 45, 87)
        val secondMax = sampleList.distinct().sortedDescending().getOrNull(1)
        println("Второй по величине: $secondMax")
        // 10. Преобразовать список чисел в множество (Set)
        val setFromList = sampleList.toSet()
        println("Множество из списка: $setFromList")
    }
}