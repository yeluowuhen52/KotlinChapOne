package com.marsjiang.kotlin

/**
 * 集合
 * @Author: Jiang
 * @Description:
 * @Date: 2019-06-03 14:00
 * @Version: 1.0
 * @Update:
 */

fun main(args: Array<String>) {
    var price = arrayOfNulls<Double>(5);
    for (i in 0 until price.size) {
        println(price.get(i));
    }

    var books = arrayOfNulls<String>(4);
    books.set(0, "小说");
    books.set(1, "文章");
    books.set(2, "散文");
    for (i in 0 until books.size) {
        println(books.get(i));
    }

    for (book in books) {
        println(books.indexOf(book));
    }

    println("indices:${books.indices}");

    println("分割线");

    //Iterator
    for ((index, value) in books.withIndex()) {
        println("索引为${index}的元素是${value}");
    }

    println(divid(12312.123321).contentToString());


    var mySetBooks = setOf(
            "疯狂图书",
            "大话设计结构",
            "小王子"
    );


    for (i in mySetBooks.indices) {
        println(mySetBooks.elementAt(i));
    }
//    for(book in mySetBooks){
//        println(book);
//    }

//    mySetBooks.forEach({ println(it)});

    var languages = mutableSetOf<String>();
    languages.add("Java");
    languages.add("GO");
    languages.add("C++");

    languages.remove("Java");

    for (lan in languages) {
        println(lan);
    }

    println("分割线")

    var it  = languages.iterator();
    while (it.hasNext()){
        var e = it.next();
        println(e);
        if(e.length<3){
            it.remove();
        }
    }

    println(languages)

}

fun divid(num: Double): Array<String> {
    var zheng = num.toLong();
    var xiao = Math.round((num - zheng) * 100);
    return arrayOf(zheng.toString(), xiao.toString());
}