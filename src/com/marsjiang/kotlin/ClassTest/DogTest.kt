package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 11:17
 * @Version: 1.0
 * @Update:
 */

fun main(args:Array<String>){
    var rn = Dog::run;

    val d = Dog();

    rn(d);
}