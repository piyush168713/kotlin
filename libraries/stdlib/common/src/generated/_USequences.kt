/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("USequencesKt")

package kotlin.sequences

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.random.*

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfUInt")
@SinceKotlin("1.5")
@WasExperimental(ExperimentalUnsignedTypes::class)
public fun Sequence<UInt>.sum(): UInt {
    var sum: UInt = 0u
    for (element in this) {
        sum += element
    }
    return sum
}

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfULong")
@SinceKotlin("1.5")
@WasExperimental(ExperimentalUnsignedTypes::class)
public fun Sequence<ULong>.sum(): ULong {
    var sum: ULong = 0uL
    for (element in this) {
        sum += element
    }
    return sum
}

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfUByte")
@SinceKotlin("1.5")
@WasExperimental(ExperimentalUnsignedTypes::class)
public fun Sequence<UByte>.sum(): UInt {
    var sum: UInt = 0u
    for (element in this) {
        sum += element
    }
    return sum
}

/**
 * Returns the sum of all elements in the sequence.
 *
 * The operation is _terminal_.
 */
@kotlin.jvm.JvmName("sumOfUShort")
@SinceKotlin("1.5")
@WasExperimental(ExperimentalUnsignedTypes::class)
public fun Sequence<UShort>.sum(): UInt {
    var sum: UInt = 0u
    for (element in this) {
        sum += element
    }
    return sum
}

