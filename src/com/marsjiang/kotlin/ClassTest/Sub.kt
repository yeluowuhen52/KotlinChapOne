package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-06 15:56
 * @Version: 1.0
 * @Update:
 */
open class Base {
    constructor() {
        println("Base 无参构造")
    }

    constructor(name: String) {
        println("Base 1参构造")
    }
}

class Sub : Base {
    constructor() {
        println("Sub 无参构造")
    }

    constructor(name: String) : super(name) {
        println("Sub String参构造")
    }

    constructor(name: String, age: Int) : this(name) {
        println("Sub String Int参构造")
    }

}

fun main(args: Array<String>) {
    Sub();
    Sub("aaa");
    Sub("222", 12);
}