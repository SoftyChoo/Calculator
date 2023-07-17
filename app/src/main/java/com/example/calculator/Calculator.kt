package com.example.calculator

class Calculator(private val operation: AbstractOperation) {
    fun operate(a : Double,b:Double) : Double{
        return operation.operate(a,b)
    }
}