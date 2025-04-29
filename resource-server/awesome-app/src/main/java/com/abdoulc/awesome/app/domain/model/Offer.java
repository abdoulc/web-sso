package com.abdoulc.awesome.app.domain.model;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
public class Offer {
    String id;
    String auctionId;
    String userId;
    BigDecimal amount;
    LocalDateTime timestamp;
}
