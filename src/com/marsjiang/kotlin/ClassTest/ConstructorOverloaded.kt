package com.marsjiang.kotlin.ClassTest

/**
 * 构造函数重载
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-06 13:36
 * @Version: 1.0
 * @Update:
 */

class ConstructorOverloaded {
    var name: String?
    var count: Int

    constructor() {
        name = "";
        count = 0;
    }

    constructor(name: String, count: Int) {
        this.name = name;
        this.count = count;
    }

}

fun main(args: Array<String>) {
    var oc1 = ConstructorOverloaded();
    var oc2 = ConstructorOverloaded("张三", 12);

    println("${oc1.name} ==== ${oc1.count}")
    println("${oc2.name} ==== ${oc2.count}")
}