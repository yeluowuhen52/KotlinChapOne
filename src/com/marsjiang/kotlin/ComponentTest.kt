package com.marsjiang.kotlin

import com.marsjiang.kotlin.ClassTest.User

/**
 * 解构Test
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 12:40
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    var user = User("youku", "yyy", 22);

    var (name, pass, age) = user;

    println("name${name} pass${pass} age${age}");

}