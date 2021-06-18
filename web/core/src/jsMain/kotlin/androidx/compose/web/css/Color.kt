@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package org.jetbrains.compose.web.css

external interface CSSColorValue: StylePropertyValue, CSSVariableValueAs<CSSColorValue>

abstract class Color : CSSStyleValue, CSSColorValue {
    data class Named(val value: String) : Color() {
        override fun toString(): String = value
    }

    data class RGB(val r: Number, val g: Number, val b: Number) : Color() {
        override fun toString(): String = "rgb($r, $g, $b)"
    }

    data class RGBA(val r: Number, val g: Number, val b: Number, val a: Number) : Color() {
        override fun toString(): String = "rgba($r, $g, $b, $a)"
    }

    data class HSL(val h: CSSAngleValue, val s: Number, val l: Number) : Color() {
        constructor(h: Number, s: Number, l: Number) : this(h.deg, s, l)

        override fun toString(): String = "hsl($h, $s%, $l%)"
    }

    data class HSLA(val h: CSSAngleValue, val s: Number, val l: Number, val a: Number) : Color() {
        constructor(h: Number, s: Number, l: Number, a: Number) : this(h.deg, s, l, a)

        override fun toString(): String = "hsla($h, $s%, $l%, $a)"
    }

}

fun Color(name: String): Color = Color.Named(name)