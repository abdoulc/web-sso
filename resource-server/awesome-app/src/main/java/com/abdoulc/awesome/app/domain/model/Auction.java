package com.abdoulc.awesome.app.domain.model;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
public class Auction {
    String id;
    String sellerId;
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
