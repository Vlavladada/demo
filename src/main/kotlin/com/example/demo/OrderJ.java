package com.example.demo;

import java.util.UUID;

public class OrderJ {
    UUID id;
    UUID deviveryId;
    DeliveryStatus status;

    enum DeliveryStatus{
        PENDING,
        INITIATED,
        IN_TRANSIT,
        DELIVERED
    }

}
