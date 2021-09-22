package com.example.myapplication3

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun getList(): ArrayList<String> {
        val stringArrayList = ArrayList<String>()
        stringArrayList.add("あいうえお")
        stringArrayList.add("かきくけこ")
        stringArrayList.add("さしすせそ")
        stringArrayList.add("たちつてと")
        stringArrayList.add("なにぬねの")
        stringArrayList.add("はひふへほ")
        stringArrayList.add("まみむめも")
        stringArrayList.add("やゆよ")
        stringArrayList.add("らりるれろ")
        stringArrayList.add("わをん")
        return stringArrayList
    }
}