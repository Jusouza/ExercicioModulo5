package com.example.exerciciomodulo5

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org

 */


//JULIANA SOUZA - EXERCICIO MODULO 5


fun main() {

    var vehicle = Vehicle()
    vehicle.print()
    vehicle.increaseVelocity(60)
    vehicle.print()
    vehicle.decreaseVelocity(20)
    vehicle.print()
    vehicle.increaseVelocity(60)
    vehicle.print()
    vehicle.decreaseVelocity(120)
    vehicle.print()

}

class Vehicle() {
    var velocity: Long = 0
    var acceleration: Long = 10
    var model: String = "Dodge RAM"

    init{
        this.model = model
        this.velocity = velocity
        this.acceleration = acceleration
    }

    fun increaseVelocity(acceleration: Long){
        velocity += acceleration
    }

    fun decreaseVelocity(acceleration: Long): Long{
        velocity -= acceleration

        if(velocity < 0){
            velocity = 0
        }
        return velocity
    }

    fun currentVelocity() = this.velocity

    fun print(){
        println("model: $model, velocity: $velocity")
    }

}




