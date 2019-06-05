package com.marsjiang.kotlin

/**
 * 重载方法
 *
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 9:21
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    test();
    test(12);
    test("test");
}


fun test() {
    println("无参方法")
}

fun test(msg: String) {
    println("一个参方法")
}

fun test(msg: Int): String {
    println("返回值方法")
    return "返回值";
}