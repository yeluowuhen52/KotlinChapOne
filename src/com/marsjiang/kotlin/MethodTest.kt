package com.marsjiang.kotlin

/**
 * 函数测试
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-04 14:35
 * @Version: 1.0
 * @Update:
 */
fun main(args: Array<String>) {
    println("${max(12, 11)}");
    sayHi();
    println("${fn(10)}");
    println("${area(12.0, 21.0)}");
    sayNothing();

    test("123", "321", a = 2);
}

fun max(x: Int, y: Int): Int {
    var max = if (x > y) x else y;
    return max;
}

fun sayHi(): Unit {
    println("void函数")
}

fun fn(n: Int): Int {
    if (n == 0) {
        return 1
    } else if (n == 1) {
        return 4
    } else {
        return 2 * fn(n - 1) + fn(n - 2)
    }
}

fun area(x: Double, y: Double): Double = x * y;

fun sayNothing(name: String = "猪八戒", message: String = "欢迎学习Kotlin") {
    print("name = ${name}");
    print("message = ${message}");
}

fun test(vararg books: String, a: Int) {
    for (b in books) {
        println(b)
    }
    println(a)
}
