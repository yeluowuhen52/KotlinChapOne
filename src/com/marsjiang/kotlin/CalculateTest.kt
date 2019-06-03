package com.marsjiang.kotlin

/**
 * @Author: Jiang
 * @Description:
 * @Date: 2019-05-31 14:36
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    var a = 20;
    var b = -a;
    val c = a.unaryMinus();
    println("b:${b},c:${c}");

    var aa = 20;
    //自增
    println(aa.inc());
    //自减
    println(aa.dec());


    var javaTest = "java.org";
    println("java" in javaTest);


    var s1 = java.lang.String("java");
    var s2 = java.lang.String("java");

    println(s1 === s2);
    println(s1.equals(s2));

    var range = 2..6;
    for (num in range) {
        println("${num}");
    }

    var books = arrayOf("Sw", "aa", "bb", "c", "c++");
    //半开区间 包括a 到b-1
    for (index in 0 until books.size) {
        println(books.get(index));
    }

    //反向区间
    var range1 = 6 downTo 2;
    for (num in range1) {
        println(num);
    }

    //区间步长
    for (num in 7 downTo 1 step 2) {
        print("${num} ")
    }

    //when语句

    var score = 'C';
    when (score) {
        'A' -> {
            println("优秀！");
        }
        'B' -> {
            println("中等！");
        }
        else -> {
            println("真捞哦！");
        }
    }

    var age = 39;
    var str = when (age) {
        in 10..25 -> {
            "小时候"
        }
        in 25..30 -> {
            "中年"
        }
        in 31..50 -> {
            "老年"
        }
        else -> {
            "其他"
        }
    }
    println("${age}---${str}");

    //判断类型
    var intputPrice = 22;
    println(realPrice(intputPrice));

    var count = 10;
    do
        println(count++)
    while (count < 20)
    println("循环结束");


    //循环测试
    for (i in 0 until 5) {
        var j = 0;
        while (j < 3) {
            println("i的值是${i},j的值是${j++}");
        }
    }

    for (i in 0..20) {
        println("${i}");
        if (i == 3) {
            break;
        }
    }

    //循环结束标识符
    outer@ for (i in 0 until 5) {
        for (j in 0 until 10) {
            println("i的值是${i},j的值是${j}");
            if (j == 1) {
                break@outer
            }
        }
    }

    for (i in 0 until 3) {
        println("i的值是${i}");
        if (i == 1) {
            continue;
        }
        println("continue后的输出语句");
    }


    outer@ for (i in 0 until 5) {
        for (j in 0 until 3) {
            println("i的值为${i},j的值是${j}");
            if (j == 1) {
                continue@outer
            }
        }
    }
}

/**
 * 获取真实价格
 */
fun realPrice(inputPrice: Any) = when (inputPrice) {
    is String -> {
        inputPrice.toDouble();
    }
    is Int -> {
        inputPrice.toDouble();
    }
    is Double -> {
        inputPrice.toDouble();
    }
    else -> {
        0.0
    }
}