package com.example.nbcamp_week3_assignment

class Bread() : Menu() {
    override fun add(orderList: MutableList<String>) {
        var num = 1
        for (menu in breadArray) {
            println("[${num}] ${menu[1].padEnd(6)} ₩ | ${menu[0]}")
            num++
        }

        //예외처리//2
        var choice = readln()!!.toInt()
        orderList.add(breadArray[choice - 1][0].toString())

    }
}
//