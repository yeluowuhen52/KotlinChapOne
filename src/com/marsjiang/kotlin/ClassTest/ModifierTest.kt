package com.marsjiang.kotlin.ClassTest

/**
 * 访问权限控制
 *
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-06 12:55
 * @Version: 1.0
 * @Update:
 */

open class Outer {
    private val a = 1;
    protected val b = 2;
    internal val c = 3;
    val d = 4;

    protected class Nested {
        public val e: Int = 5;
    }
}

class SubClass : Outer() {

}