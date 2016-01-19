package de.martenl.mlli.elements

/**
 * Created on 19.01.2016.
 */

class LispFunction(val func: (List<LispElement>) -> LispElement) : LispElement {
    fun apply(args:List<LispElement>): LispElement = func(args)
}

val addPrimitive = LispFunction {(elements:List<LispElement>)-> elements.map { x -> x as LispValue }.reduceRight { x, y -> x.add(y) }}
val subtractPrimitive = LispFunction {(elements:List<LispElement>)-> elements.map { x -> x as LispValue }.reduceRight { x, y -> x.minus(y) }}

