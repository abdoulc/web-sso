package com.abdoulc.awesome.app.domain.service;

import com.abdoulc.awesome.app.domain.port.AuctionRepository;
import com.abdoulc.awesome.app.domain.port.OfferRepository;
import com.abdoulc.awesome.app.domain.port.OfferUseCase;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class OfferUseCaseImpl implements OfferUseCase {
    private final OfferRepository offerRepository;
    private final AuctionRepository auctionRepository;

    @Autowired
    public OfferUseCaseImpl(final OfferRepository offerRepository, final AuctionRepository auctionRepository) {
        this.offerRepository = offerRepository;
        this.auctionRepository = auctionRepository;
    }

    @Override
    public void placeOffer(final String auctionId, final String UserId, final BigDecimal amount) {
        //check is auction exists
        //check is amount > currentPrice (Auction)
        //update Auction currentPrice and winningOfferId
        //create offer in offer tab
    }
}
