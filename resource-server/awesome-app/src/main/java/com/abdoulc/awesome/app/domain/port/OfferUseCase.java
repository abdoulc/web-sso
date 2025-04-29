package com.abdoulc.awesome.app.domain.port;

import java.math.BigDecimal;

public interface OfferUseCase {
    void placeOffer(String auctionId, String UserId, BigDecimal amount);
}
