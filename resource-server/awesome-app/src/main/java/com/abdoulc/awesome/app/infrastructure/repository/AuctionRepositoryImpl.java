package com.abdoulc.awesome.app.infrastructure.repository;

import com.abdoulc.awesome.app.domain.model.Auction;
import com.abdoulc.awesome.app.domain.model.Item;
import com.abdoulc.awesome.app.domain.port.AuctionUseCase;
import com.abdoulc.awesome.app.infrastructure.entity.AuctionEntity;
import com.abdoulc.awesome.app.infrastructure.repository.data.SpringDataAuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuctionRepositoryImpl implements AuctionUseCase {

    private final SpringDataAuctionRepository auctionRepository;

    @Autowired
    public AuctionRepositoryImpl(final SpringDataAuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    @Override
    public void createAuction(final Item item, final String userId) {
        AuctionEntity entity = new AuctionEntity();
        auctionRepository.save(entity);
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
