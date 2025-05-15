package com.abdoulc.awesome.app.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")
@Value
@Builder
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String description;
}
