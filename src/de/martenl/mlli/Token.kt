package de.martenl.mlli

/**
 * Created on 19.01.2016.
 */

interface Token

data class LeftParens : Token
data class RightParens : Token
data class Identifier(val value : String) : Token
data class NumberValue(val value: Double) : Token
data class StringValue(val value : String) : Token
