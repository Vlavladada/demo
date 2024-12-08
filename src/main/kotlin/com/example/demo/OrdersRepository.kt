package com.example.demo

interface OrdersRepository {
    fun getByDriverId(): List<OrderJ>
}