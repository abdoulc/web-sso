package com.abdoulc.awesome.app.domain.port;

import java.math.BigDecimal;

public interface OfferRepository {
    void placeOffer(String auctionId, String UserId, BigDecimal amount);

}
