package de.martenl.mlli.elements

/**
 * Created on 19.01.2016.
 */
interface LispValue : LispElement {
    fun add(other:LispValue): LispValue
    fun minus(other:LispValue): LispValue
}