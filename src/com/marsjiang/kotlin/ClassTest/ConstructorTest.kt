package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-06 13:19
 * @Version: 1.0
 * @Update:
 */

class ConstructorTest(name: String, count: Int) {
    var name:String
    var count:Int

    init {
        this.name = name;
        this.count = count;
    }
}

fun main(args:Array<String>){
    var tc = ConstructorTest("疯狂",123);
    println(tc.name)
    println(tc.count)
}