package de.martenl.mlli

import de.martenl.mlli.elements.LispElement

/**
 * Created on 19.01.2016.
 */
class Environment(val values:MutableMap<String, LispElement>){

    companion object{
        fun apply(){

        }
    }
    public fun get(key:String): LispElement? {
        return values.get(key)
    }

    public fun set(key:String,value: LispElement){
        values.put(key,value)
    }
}
