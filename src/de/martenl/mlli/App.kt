package de.martenl.mlli

fun main(args : Array<String>){
    println("hello lisp")
    val ints = linkedListOf(LispInteger(1),LispInteger(2),LispInteger(3))
    println(addPrimitive.apply(ints))
    val myInterpreter = Interpreter()
    myInterpreter.repl()
}

interface Token
data class LeftParens : Token
data class RightParens : Token
data class Identifier(val value : String) : Token
data class NumberValue(val value: Double) : Token
data class StringValue(val value : String) : Token

class Parser{

    fun parse(tokens:List<Token>,env:Environment){

    }
}

class Interpreter{

    fun readFromFile(filePath:String){

    }

    fun repl(){
        var running = true
        while(running){
            val input =  readLine()
            if(input.isNullOrEmpty()) {
                continue
            }
            val line = input.toString()
            when(line){
                "quit" -> running = false
                else -> {
                    val tokens = tokenize(line)
                    for (token in tokens) {
                        println(token)
                    }
                }
            }
        }
    }

    fun tokenize(line:String): List<String> {
        return line.replace("("," ( ").replace(")"," ) ").splitBy(" ").filter { s -> s.isNotEmpty() }
    }



    fun eval(tokens:List<String>,env:Environment){

    }
}


class Environment(val values:MutableMap<String,LispElement>){

    companion object{
        fun apply(){

        }
    }
    public fun get(key:String): LispElement? {
        return values.get(key)
    }

    public fun set(key:String,value:LispElement){
        values.put(key,value)
    }
}

interface LispElement {}

class LispFunction(val func: (List<LispElement>) -> LispElement) : LispElement{
    fun apply(args:List<LispElement>):LispElement = func(args)
}

val addPrimitive = LispFunction {(elements:List<LispElement>)-> elements.map { x -> x as LispValue }.reduceRight { x, y -> x.add(y) }}
val subtractPrimitive = LispFunction {(elements:List<LispElement>)-> elements.map { x -> x as LispValue }.reduceRight { x, y -> x.minus(y) }}

interface LispValue : LispElement{
    fun add(other:LispValue): LispValue
    fun minus(other:LispValue): LispValue
}

class LispInteger(public val value:Int) : LispValue {

    override fun add(other: LispValue): LispValue {
        if(other is LispInteger){
            return LispInteger(value + other.value)
        }else{
            return this
        }
    }

    override fun minus(other:LispValue): LispValue {
        if(other is LispInteger){
            return LispInteger(value + other.value)
        }else{
            return this
        }
    }

}
/*
   (elements:List<LispElement>) -> {
 */