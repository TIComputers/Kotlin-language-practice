fun main () {
    println("Hello, Kotlin!")
    println("")

//    calculate()
//    test()
//    expression(10, 1)
//    When(day = 4)
//    While(num1 = 5)
//    Break_Continue(5, 15)
}


/** this is sum random number */
fun calculate(){
    var sum1 = 10 * 2   // 20
    var sum2 = 20 + 3   // 60
    var sum3 = 30 / 10  // 3
    var sum4 = 30 * 30  // 900
    var sum5 = 30 % 2   // 0

    println(sum1)
    println(sum2)
    println(sum3)
    println(sum4)
    println(sum5)
}


fun test() {
    val text: String = "Hello, world!"

    val index1 = text[1]
    val index2 = text[2]

    println("index1 = $index1")
    println("index2 = $index2")
}

/** This is a test expression */
fun expression(num1 : Int, num2 : Int){
    val x : Int = num1
    val y : Int = num2

    if (x == y) {
        print("x is neither 1 nor 2")
    }
    else if (x > y) {
        print("x is neither 1 nor 2")
    }
    else {
        println("x is neither 1 nor 2")
    }

}

fun When(day: Int){
    /** this is like of switch case in c &... and match case in python  and switch in java */
    when (day) {
        1 -> print("Monday")
        2 -> print("Tuesday")
        3 -> print("Wednesday")
        4 -> print("Thursday")
        5 -> print("Friday")
        6 -> print("Saturday")
        7 -> print("Sunday")
        else -> print("It is neither 1 nor 2")
    }
}

fun While(num1 : Int){
    var num1: Int = num1

    while (num1 < 10){
        println(num1)
        num1++
    }
}

/** This is while and if(break) */
fun Break_Continue(num: Int, num2: Int){
    var num: Int = num

    while(num <= 30){

        if (num2 == num){
            num++
            continue
        }
        println(num)
        num++
    }
}


