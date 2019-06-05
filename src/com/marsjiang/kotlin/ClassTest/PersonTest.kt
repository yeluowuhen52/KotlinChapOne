package com.marsjiang.kotlin.ClassTest

/**
 * 测试类
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-05 10:43
 * @Version: 1.0
 * @Update:
 */
fun main(args: Array<String>) {
    var p: Person;
    p = Person();

    p.name = "张三";
    p.age = 12;

    p.say("PPP  ${p.name} ${p.age}");


}