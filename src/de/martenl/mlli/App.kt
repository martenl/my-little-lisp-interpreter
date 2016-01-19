package de.martenl.mlli

import de.martenl.mlli.elements.LispInteger
import de.martenl.mlli.elements.addPrimitive

fun main(args : Array<String>){
    println("hello lisp")
    val ints = linkedListOf(LispInteger(1),LispInteger(2),LispInteger(3))
    println(addPrimitive.apply(ints))
    val myInterpreter = Interpreter()
    myInterpreter.repl()
}









/*
   (elements:List<LispElement>) -> {
 */