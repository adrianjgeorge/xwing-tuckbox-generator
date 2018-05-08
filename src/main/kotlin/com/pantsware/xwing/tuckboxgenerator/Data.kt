package com.pantsware.xwing.tuckboxgenerator

import java.io.File

/**
 * Contains the static data about ship boxes, their geometry, the file for the box, and the products.
 */
object Data {
    /**
     * Describes a point in 2d space.
     */
    data class Point(val x: Int, val y: Int)

    /**
     * Provides the coordinates of the four corners of a box.
     */
    data class Box(val corner1: Point, val corner2: Point, val corner3: Point, val corner4: Point)

    /**
     * Contains all the boxes needed to describe the geometry of a tuckbox,
     * as well as the file that contains the image of the box.
     */
    data class TuckBox(val boxes: List<Box>, val image: File)

    /**
     * All the combined bits of boxes that a single model would need.
     */
    data class Model(val hangers: List<TuckBox>, val bitsBoxes: List<TuckBox>)

    val XWING_CORE = Model(listOf(), listOf())
    val TIE_FIGHTER_CORE_1 = Model(listOf(), listOf())
    val TIE_FIGHTER_CORE_2 = Model(listOf(), listOf())
    val XWING_WAVE1 = Model(listOf(), listOf())
    val TIE_FIGHTER_WAVE1 = Model(listOf(), listOf())
    val YWING_WAVE1 = Model(listOf(), listOf())
    val TIE_ADVANCED_WAVE1 = Model(listOf(), listOf())

    val products: Map<String, List<Model>> = mapOf(
            "SWX01" to listOf(XWING_CORE, TIE_FIGHTER_CORE_1, TIE_FIGHTER_CORE_2),
            "SWX02" to listOf(XWING_WAVE1),
            "SWX03" to listOf(TIE_FIGHTER_WAVE1),
            "SWX04" to listOf(YWING_WAVE1),
            "SWX05" to listOf(TIE_ADVANCED_WAVE1)
    )
}
