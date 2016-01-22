package de.martenl.mlli

/**
 * Created on 19.01.2016.
 */
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

    fun tokenize(line:String): List<Token> {
        return line.replace("("," ( ")
                .replace(")"," ) ")
                .splitBy(" ")
                .filter { s -> s.isNotEmpty() }
                .map { s -> strToToken(s) }
    }



    fun eval(tokens:List<String>,env:Environment){

    }
}