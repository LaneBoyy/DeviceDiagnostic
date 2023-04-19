package com.example.myapplication.data.database

import androidx.room.TypeConverter
import androidx.room.TypeConverters

class AppTypeConverters {
    @TypeConverter
    fun fromListIntToString(intList: List<Int>): String = intList.toString()

    @TypeConverter
    fun toListIntFromString(stringList: String): List<Int> {
        val result = ArrayList<Int>()
        val split = stringList.replace("[", "").replace("]", "").replace(" ", "").split(",")
        for (n in split) {
            try {
                result.add(n.toInt())
            } catch (e: Exception) {

            }
        }
        return result
    }

    @TypeConverter
    fun toStringFromListPair(pairList: List<Pair<Long, Int>>): String {
        return pairList.toString()
    }


    @TypeConverter
    fun toStringFromListPairPair(pairList: List<Pair<Pair<Long, Long>, Pair<String, Int>>>): String {
        return ""
    }


    @TypeConverter
    fun toListPairPairFromString(pairList: String): List<Pair<Pair<Long, Long>, Pair<String, Int>>> {
        return listOf()
    }

    @TypeConverter
    fun toListPairFromString(stringList: String): List<Pair<Long, Int>> {
        val result = ArrayList<Pair<Long, Int>>()
        val split = stringList.replace("[", "").replace("]", "").replace(" ", "").split(",")
        for (n in split) {
            try {
                result.add(
                    Pair(
                        n.substringBefore(' ').trim().toLong(),
                        n.substringAfter(' ').trim().toInt()
                    )
                )
            } catch (e: Exception) {

            }
        }
        return result
    }
}