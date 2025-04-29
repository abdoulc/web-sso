package com.abdoulc.awesome.app.domain.service;

import com.abdoulc.awesome.app.domain.model.Auction;
import com.abdoulc.awesome.app.domain.model.Item;
import com.abdoulc.awesome.app.domain.port.AuctionRepository;
import com.abdoulc.awesome.app.domain.port.AuctionUseCase;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuctionUseCaseImpl implements AuctionUseCase {
    private final AuctionRepository auctionRepository;

    @Autowired
    public AuctionUseCaseImpl(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    @Override
    public void createAuction(@NonNull final Item item, @NonNull final String userId) {
        auctionRepository.createAuction(item, userId);
    }

    @Override
    public List<Auction> getAll() {
        return auctionRepository.getAll();
    }

    @Override
    public Auction getById(@NonNull final String id) {
        return auctionRepository.getById(id);
    }


}
