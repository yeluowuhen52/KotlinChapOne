package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 12:58
 * @Version: 1.0
 * @Update:
 */

data class Result(val result: Int, val status: String)

fun factorial(n: Int): Result {
    if (n == 1) {
        return Result(1, "success")
    } else if (n > 1) {
        return Result(2, "success")
    } else {
        return Result(-1, "fail")
    }
}

fun main(args: Array<String>) {
    var(rt,status) = factorial(6);
    println(rt)
    println(status)
}