package com.marsjiang.kotlin

/**
 * MapTest
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-04 14:11
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    var map = linkedMapOf<String, String>();
    map.put("123", "123")
    map.put("321", "321")
    map.put("222", "222")

    for (em in map.entries) {
        println("${em.key}-----${em.value}");
    }

    for ((key, value) in map) {
        println("${key}+++++${value}");
    }

    for (key in map.keys) {
        println("${key}+++++${map[key]}");
    }

    map.forEach({
        println("${it.key}==========${it.value}")
    })

    var mutableMap = mutableMapOf<String, String>();
    mutableMap.put("0", "0")
    mutableMap.put("1", "1")
    mutableMap.put("2", "2")

    for ((key, value) in mutableMap) {
        println("${key}+++++${value}");
    }

}