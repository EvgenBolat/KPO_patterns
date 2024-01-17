package org.example

import org.example.Classes.Builders.CourseReportBuilder
import org.example.Classes.Builders.ScienceReportBuilder

fun main() {
    println("Первый билдер")
    val builder1 = CourseReportBuilder()
    builder1.setName("Курсовая работа 1")
    builder1.setTask("Изучение свойсв ядра Криптона")
    builder1.setScientificAdviser("Пупкин Иван Сергеевич")

    println(builder1.getJSONResult())

    builder1.setExecutor("Любкин Пётр Генрихович")
    builder1.setAnnotation("Читать с осторожностью")
    builder1.setReportString("Атомы это очень сложно")
    builder1.setListOfSources("Википедия")

    println(builder1.getJSONResult())

    println("Второй билдер")

    val builder2 = ScienceReportBuilder()
    builder2.setName("Научная работа 1")
    builder2.setTask("Вычисление среднего количество пузырьков в лимонаде")
    builder2.setFieldOfStudy("Межгалактический академик")

    println(builder2.getJSONResult())

    println()
    builder2.setTypeOfResearch("Химический")
    builder1.setAnnotation("Считали долго")
    builder1.setReportString("Зачем нам это надо?")
    builder1.setListOfSources("Текст песни Винтаж")

    println(builder2.getJSONResult())
}