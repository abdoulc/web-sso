package com.abdoulc.awesome.app.domain.port;

import com.abdoulc.awesome.app.domain.model.Auction;
import com.abdoulc.awesome.app.domain.model.Item;

import java.util.List;

public interface AuctionUseCase {
    void createAuction(Item item, String userId);
    List<Auction> getAll();
    Auction getById(String id);

}
