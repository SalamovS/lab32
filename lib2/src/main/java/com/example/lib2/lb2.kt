package com.example.lib2
fun main() {
    // 1. Создать массив из 5 целых чисел и вывести все элементы
    val array = intArrayOf(5, 12, 3, 8, 1)
    println("Элементы: ${array.joinToString()}")
    // 2. Найти сумму элементов массива
    println("Сумма: ${array.sum()}")
    // 3. Найти максимальный элемент массива
    println("Максимум: ${array.maxOrNull()}")
    // 4. Посчитать количество чётных чисел в массиве
    val evenCount = array.count { it % 2 == 0 }
    println("Кол-во чётных: $evenCount")
    // 5. Развернуть массив (вывести в обратном порядке)
    println("В обратном порядке: ${array.reversed().joinToString()}")
    // 6. Проверить, содержит ли массив заданное число
    val target = 8
    println("Содержит $target: ${target in array}")
    // 7. Отсортировать массив по возрастанию
    val sortedArray = array.sortedArray()
    println("Отсортированный: ${sortedArray.joinToString()}")
    // 8. Создать массив строк и найти самую длинную строку
    val strings = arrayOf("Kotlin", "Android", "Mobile", "IoT")
    val longest = strings.maxByOrNull { it.length }
    println("Самая длинная строка: $longest")
    // 9. Найти индекс минимального элемента массива
    val minIndex = array.indices.minByOrNull { array[it] }
    println("Индекс минимума: $minIndex")
    // 10. Умножить каждый элемент массива на 2
    val doubledArray = array.map { it * 2 }
    println("Умноженные на 2: ${doubledArray.joinToString()}")


    //ArrayList

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


    //Set

    // 1. Создать множество из чисел и вывести его
    val numbersSet = mutableSetOf(10, 20, 30, 40)
    println("Множество: $numbersSet")
    // 2. Добавить в множество повторяющиеся элементы и проверить результат
    numbersSet.add(20)
    numbersSet.add(50)
    println("После добавления 20 и 50 (дубликат не добавился): $numbersSet")
    val setA = setOf(1, 2, 3, 4, 5)
    val setB = setOf(4, 5, 6, 7, 8)
    // 3. Найти пересечение двух множеств
    println("Пересечение: ${setA.intersect(setB)}")
    // 4. Найти объединение двух множеств
    println("Объединение: ${setA.union(setB)}")
    // 5. Найти разность двух множеств (элементы A, которых нет в B)
    println("5Разность (A - B): ${setA.subtract(setB)}")
    // 6. Проверить, содержится ли элемент в множестве
    println("6. Содержит ли 3: ${3 in setA}")
    // 7. Подсчитать количество уникальных символов в строке
    val text = "hello world"
    val uniqueCharsCount = text.toSet().size
    println("7. Уникальных символов в \"$text\": $uniqueCharsCount")
    // 8. Преобразовать список в множество для удаления дубликатов
    val listWithDuplicates = listOf(1, 2, 2, 3, 4, 4, 4, 5)
    val uniqueSet = listWithDuplicates.toSet()
    println("8. Список без дубликатов: $uniqueSet")
    // 9. Найти симметрическую разность двух множеств
    val symDifference = (setA - setB) + (setB - setA)
    println("9. Симметрическая разность: $symDifference")
    // 10. Создать множество строк и проверить, есть ли там слово "Kotlin"
    val stringSet = setOf("Java", "Kotlin", "Swift", "Python")
    println("10. Содержит \"Kotlin\": ${"Kotlin" in stringSet}")
    //Map



    // 1. Создать словарь с ключами Int и значениями String (ID -> имя)
    val users = mutableMapOf(
        1 to "Алексей",
        2 to "Мария",
        3 to "Иван"
    )
        println("1. Исходная Map: $users")
    // 2. Добавить новый элемент в Map
    users[4] = "Елена"
    println("2. После добавления ID 4: $users")
    // 3. Получить значение по ключу
    println("3. Имя пользователя с ID 2: ${users[2]}")
    // 4. Проверить, есть ли ключ в Map
    println("4. Содержит ключ 3: ${users.containsKey(3)}")
    // 5. Проверить, есть ли значение в Map
    println("5. Содержит значение \"Мария\": ${users.containsValue("Мария")}") // 6. Вывести все ключи и значения
    println("6. Все ключи: ${users.keys}")
    println("   Все значения: ${users.values}")
    // 7. Удалить элемент по ключу
    users.remove(1)
    println("7. После удаления элемента с ключом 1: $users")
    // 8. Посчитать количество элементов в Map
    println("8. Размер Map: ${users.size}")
    // 9. Пройтись циклом по словарю и вывести все пары ключ-значение
    println("9. Обход словаря:")
    for ((id, name) in users) {
        println("   ID: $id, Имя: $name")
    }
    // 10. Создать Map для хранения оценок студентов и найти среднюю оценку
    val studentGrades = mapOf(
        "Алексей" to 85,
        "Мария" to 92,
        "Иван" to 78,
        "Елена" to 95
    )
    val averageGrade = studentGrades.values.average()
    println("10. Средняя оценка студентов: $averageGrade")
}




}