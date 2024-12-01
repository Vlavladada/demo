package com.example.demo

import java.util.UUID

data class Order(
    val id: UUID,
    val deviveryId: UUID?,
    val status: DeliveryStatus
) {
    enum class DeliveryStatus{
        PENDING,
        INITIATED,
        IN_TRANSIT,
        DELIVERED
    }
}
