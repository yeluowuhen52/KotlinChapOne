package com.marsjiang.kotlin.ClassTest

/**
 * 构造方法测试
 *
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-06 13:09
 * @Version: 1.0
 * @Update:
 */
class PersonInit(name: String) {
    init {
        var a = 6
        if (a > 4) {
            println("Person初始化模块：局部变量a的值大于4");
        }
        println("Person init");
        println("name is ${name}")
    }

    init {
        println("Person init 2");
    }

}
fun main(args: Array<String>) {
    PersonInit("猪八戒");
}