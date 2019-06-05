package com.marsjiang.kotlin

/**
 * 局部函数
 *
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 9:35
 * @Version: 1.0
 * @Update:
 */
fun main(args: Array<String>) {
    println("${getMathFunc("cube", 12)}");

    var square: (Int) -> Int = { it * it }
    println(square(9));
}

fun getMathFunc(type: String, nn: Int): Int {
    fun square(n: Int): Int {
        return n * n;
    }

    fun cube(n: Int): Int {
        return n * n * n;
    }

    fun factorial(n: Int): Int {
        var result = 1;
        for (index in 2..n) {
            result *= index;
        }
        return result;
    }
    when (type) {
        "square" -> return square(nn)
        "cube" -> return cube(nn)
        else -> return factorial(nn)
    }
}