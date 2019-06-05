package com.marsjiang.kotlin.ClassTest

/**
 * Dog类
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 10:50
 * @Version: 1.0
 * @Update:
 */
class Dog {
    fun jump() {
        println("跳跳")
    }

    fun run() {
        this.jump();
        println("跑跑")
    }
}