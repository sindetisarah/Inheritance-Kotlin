//This is the open"parent" class resulting from the common state of class Bus and Car

open class Vehicle(var make:String,var model:String,var color:String,var capacity:Int) {
// Common behaviours/functions inherited by both vehicles

    fun carry(people: Int) {

        if (capacity <= people) {
            println("Carrying $people passengers")
        } else if (capacity > people) {
            var exceed = people - capacity
            println("Over capacity by $exceed")
        }
    }

    open fun calculateParkingFees(hours: Int): Int {
        var parkFees = hours * 20
        return parkFees
    }
}



//Blueprint for object car inheriting from open class Vehicles

class Car( make:String, model:String, color:String, capacity:Int):Vehicle( make, model, color, capacity) {

    fun identity() {
        println("I am $color $make $model")
    }


}

//Template/Plan for our object bus inheriting from class Vehicles

class Bus( make:String, model:String, color:String, capacity:Int):Vehicle( make, model, color, capacity) {


    fun maxTripFare(fare: Double): Double {
        return fare * capacity


    }
//overiding open function  from open parent class Vehicles

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity
    }
}

fun main(){
//    Instanciating the objects

    var car=Car("Subaru","Legacy","White",10)
    println(car.carry(9))
    println(car.carry(12))

    println(car.identity())
    println(car.calculateParkingFees(20))



    var bus=Bus("Scania","Galaxy","Yellow",30)
    println(bus.maxTripFare(200.00.toDouble()))
    println(bus.maxTripFare(300.00.toDouble()))
    println(bus.calculateParkingFees(45))
}






