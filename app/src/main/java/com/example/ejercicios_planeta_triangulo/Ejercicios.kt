package com.example.ejercicios_planeta_triangulo

import android.media.Image.Plane


class Planeta(var nombre:String, var tipo:String, var masa:Double){


    constructor() : this("Tierra", "Rocoso", 130.3)

    var planetas : MutableList<plan> = mutableListOf()







}
var planeta1 = Planeta("Jupiter", "Gaseoso", 240.5)
var planeta2 = Planeta("Urano","Rocoso",100.7)




class SistemaSolar(plan: plan){

    fun recibir(){
        var planetaDefault= Planeta()

        planetaDefault.planetas = mutableListOf(
            plan("Tierra", "Rocoso", 100.2),
            plan("Jupiter","Gaseoso",899.6)

        )
    }
    fun planetaMayor(){


        if(planeta2.masa>planeta1.masa)

            println(planeta2.nombre);
        else{
            println(planeta1.nombre)
        }


    }

    fun planetaMenor(){
        if(planeta2.masa<planeta1.masa)

            println(planeta2.nombre);
        else{
            println(planeta1.nombre)
        }
    }

    fun masaMedia(){
        println(planeta1.masa/ planeta2.masa * 2)
    }


}

fun main(){





}