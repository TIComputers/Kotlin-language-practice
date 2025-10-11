fun main(){

    prime(1234567810)

}


fun prime(num1: Int){
    var check :Int = 1
    var count :Int = 0

    while (check <= num1){
        if (num1 % check == 0) {
            count++
        }
        check ++
    }
    if (count <= 2){
        println("Your number ($num1) is prime")
    }
    else{
        println("Your number ($num1) is not prime --> Your count: $count")
    }
    Prime(count)
}

fun Prime(num: Int){

    var count :Int = 0

    for (i in 1..num){
        if (num % i == 0){
            count++
        }
    }
    if (count <= 2){
        println("Your number ($num) is prime")
    }
    else{
        println("Your number ($num) is not prime --> Your count: $count")
    }
    prime(count)
}