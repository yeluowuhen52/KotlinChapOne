package com.marsjiang.kotlin

/**
 * Kotlin测试
 *
 * @Author: Jiang
 * @Description:
 * @Date: 2019-05-31 11:07
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    var result = "";
    for (i in 0..5) {
        var intValue = (Math.random() + 10 + 97);
        result += intValue.toChar();
    }
    println(result);

    var test = true;
    println("${test}代表真");

    var str = "fkky";
    var num: Int? = str.toIntOrNull();
//    var num:Int? = str.toIntOrNull();

    println("${num}");

    var aStr: String = "fkit";
    var bStr: String? = "fkit";

//    aStr = null;
    bStr = null;

    println(aStr.length);
//    println(bStr.length);

    var b: String? = "fkit";

    var len = if (b != null) b.length else -1;

    println(len);

    b = null;

    if (b != null && b.length > 0) {
        println(b.length);
    } else {
        println("空字符串");
    }


    var bool: Boolean? = null;
    if (bool == true) {
        println("Boolean");
    }

    var testStr: String? = "fkit";
    println(testStr?.length);

    testStr = null;
    println(testStr?.length);

    var myArr: Array<String?> = arrayOf("fkit", "moon", "earth", null, "crazy");

    for (item in myArr) {
        item?.let {
            println(item);
        }
    }

    var strTest: String? = "fkit";

    strTest = null;

    var len2 = strTest?.length ?: -1;

    println(len2);
}