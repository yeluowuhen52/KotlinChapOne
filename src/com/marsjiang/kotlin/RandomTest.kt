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

    var strCrazy = "fkkit";
    println(strCrazy[1]);

    for (c in strCrazy) {
        print("${c} ")
    }

    val txt = """
        |床前明月光,
        |疑是地上霜,
        |举头望明月,
        |低头思故乡。
    """.trimMargin()
    println(txt);

    val myTxt = """
        ^床前明月光,
        ^疑是地上霜,
        ^举头望明月,
        ^低头思故乡。
    """.trimMargin("^")
    println(myTxt);


    var ran = java.util.Random();
    println("随机数是：${ran.nextInt(10)}");

    val s1 = "123.123";
    val d:Double = s1.toDouble();
    println(d);


    //首字母大小写
    var firstStr = "Fkiitt";
    println(firstStr.decapitalize());

    var comnmonStr = "crazy.org";
    println(comnmonStr.commonPrefixWith("crazy.txt"));
    println(comnmonStr.commonSuffixWith("aa.org"));
}