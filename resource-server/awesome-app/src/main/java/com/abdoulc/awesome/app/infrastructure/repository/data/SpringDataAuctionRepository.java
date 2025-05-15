package com.abdoulc.awesome.app.infrastructure.repository.data;

import com.abdoulc.awesome.app.infrastructure.entity.AuctionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  SpringDataAuctionRepository  extends JpaRepository<AuctionEntity, Long> {
}
