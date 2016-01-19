package de.martenl.mlli.elements

/**
 * Created on 19.01.2016.
 */
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