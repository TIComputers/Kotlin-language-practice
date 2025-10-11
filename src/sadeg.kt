class Car{
    var name :String = ""
    var model :String = ""
    var color :String = ""
    var price :Long = 0L
    var type :String = ""




    fun Tax(){
        val tax = (price * 1.05) - price
        val price  = price + tax
        println("final price: $price \tyour tax: $tax")
    }

    fun clear_car(){
        val price_clear = price * 0.00000002
        println("clear price: $price_clear")
    }
}

fun main(){
    var c1 = Car()
    c1.price = 3000000000
    c1.Tax()
    c1.clear_car()
}

open class Preson{
    open fun Tax(){}

}