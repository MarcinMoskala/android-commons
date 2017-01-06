package com.elpassion.android.commons.recycler.basic

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class UtilsTest {

    @Test
    fun shouldCreateBasicMapWithAsBasicMap() {
        val source = mapOf(1 to "A")
        val basicMap = source.asBasicMap()

        assertEquals(basicMap[1], "A")
    }

    @Test
    fun shouldCreateBasicMapWithBasicMapOf() {
        val basicMap = basicMapOf(1 to "A", 2 to "B")

        assertEquals(basicMap[1], "A")
        assertEquals(basicMap[2], "B")
    }

    @Test
    fun shouldCreateBasicListWithAsBasicList() {
        val source = listOf("A")
        val basicList = source.asBasicList()

        assertEquals(basicList[0], "A")
    }

    @Test
    fun shouldCreateBasicListWithBasicListOf() {
        val basicList = basicListOf("A", "B")

        assertEquals(basicList[0], "A")
        assertEquals(basicList[1], "B")
    }

    @Test
    fun shouldCreateBasicMapOfBasicListsWithAsBasicMapOfBasicLists() {
        val source = mapOf("A" to listOf("AA", "AB"), "B" to listOf("BA", "BB"))
        val basicMapOfBasicLists = source.asBasicMapOfBasicLists()

        assertEquals(basicMapOfBasicLists["A"]!![0], "AA")
        assertEquals(basicMapOfBasicLists["A"]!![1], "AB")
        assertEquals(basicMapOfBasicLists["B"]!![0], "BA")
        assertEquals(basicMapOfBasicLists["B"]!![1], "BB")
        assertNull(basicMapOfBasicLists["C"])
    }
}