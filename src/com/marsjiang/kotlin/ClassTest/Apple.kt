package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-10 12:54
 * @Version: 1.0
 * @Update:
 */

class Apple : Fruit(0.0) {
    fun main(args: Array<String>) {
        var a = Apple();
        a.weight = 5.5;
        a.info();
    }
}