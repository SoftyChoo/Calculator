package com.example.calculator

class AddOperation : AbstractOperation(){
    override fun operate(a: Double, b: Double): Double{
        return a+b
    }
}