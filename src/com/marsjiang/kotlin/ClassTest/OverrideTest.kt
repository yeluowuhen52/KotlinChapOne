package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-10 13:29
 * @Version: 1.0
 * @Update:
 */
open class Foo {
    open fun test() {
        println("Foo de test")
    }

    fun Foo() {
        println("Foo")
    }
}

interface Bar {
    fun test() {
        println("Bar 的 test")
    }

    fun bar() {
        println("Bar")
    }
}

class Wow : Foo(), Bar {
    override fun test() {
        super<Bar>.test()
        super<Foo>.test()
    }
}

fun main(args: Array<String>) {
    var w = Wow();
    w.test()
}