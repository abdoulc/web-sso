package com.abdoulc.awesome.app.infrastructure.repository;

import com.abdoulc.awesome.app.domain.model.Auction;
import com.abdoulc.awesome.app.domain.model.Item;
import com.abdoulc.awesome.app.domain.port.AuctionUseCase;

import java.util.List;

public class AuctionRepositoryImpl implements AuctionUseCase {
    @Override
    public void createAuction(final Item item, final String userId) {
        
    }

    @Override
    public List<Auction> getAll() {
        return null;
    }

    @Override
    public Auction getById(final String id) {
        return null;
    }
}
