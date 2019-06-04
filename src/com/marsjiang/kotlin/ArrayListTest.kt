package com.marsjiang.kotlin

/**
 * List 测试
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-04 11:14
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    var list = listOf("Java", "Kotlin", null, "Go");
    for(temp in list){
        println(temp)
    }

    println(list.subList(0,2));

    var mulList  = mutableListOf<String>();
    mulList.add("Java");
    mulList.add("Go");
    mulList.add("C++");
    mulList.add("Python");

    mulList.removeAt(0);

    for(temp in mulList){
        println(temp)
    }


}