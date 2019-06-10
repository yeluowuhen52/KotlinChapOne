package com.marsjiang.kotlin.ClassTest

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-10 13:00
 * @Version: 1.0
 * @Update:
 */
class OStrich :Bird(1.1){
    override fun fly() {
        println("子类方法")
    }
}
fun main(args:Array<String>){
    var os = OStrich();
    os.fly();
}