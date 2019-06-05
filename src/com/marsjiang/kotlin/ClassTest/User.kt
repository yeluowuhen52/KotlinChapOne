package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 12:42
 * @Version: 1.0
 * @Update:
 */
class User(name: String, pass: String, age: Int) {
    var name = name;
    var pass = pass;
    var age = age;

    operator fun component1(): String {
        return this.name;
    }

    operator fun component2(): String {
        return this.pass;
    }

    operator fun component3(): Int {
        return this.age;
    }
}