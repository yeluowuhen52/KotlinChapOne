package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-10 13:10
 * @Version: 1.0
 * @Update:
 */
open class MyBaseClass {
    open var a: Int = 5;
}

class MySubClass : MyBaseClass() {
    override var a: Int = 7;
    fun accessOwner() {
        println(a)
    }

    fun accessBase(){
        println(super.a)
    }
}

fun main(args:Array<String>){
    val sc = MySubClass();
    sc.accessOwner();
    sc.accessBase();
}