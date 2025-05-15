package com.abdoulc.awesome.app.infrastructure.entity;

import com.abdoulc.awesome.app.domain.model.AuctionStatus;
import com.abdoulc.awesome.app.domain.model.Item;
import jakarta.persistence.*;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "auctions")
@Value
public class AuctionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;    String sellerId;
    Item item;
    BigDecimal startingPrice;
    BigDecimal currentPrice;
    //Minimum price to valid an Auction
    BigDecimal reservePrice;
    LocalDateTime startTime;
    LocalDateTime endTime;
    String winningOfferId;
    AuctionStatus status;
    LocalDateTime createdAt;
}
