package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-10 12:59
 * @Version: 1.0
 * @Update:
 */
open class Bird(var num:Double) {
    open fun fly() {
        println("我在空中飞翔！${num}")
    }
}