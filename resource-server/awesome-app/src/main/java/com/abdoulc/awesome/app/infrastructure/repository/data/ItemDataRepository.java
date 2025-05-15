package com.abdoulc.awesome.app.infrastructure.repository.data;

import com.abdoulc.awesome.app.infrastructure.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDataRepository extends JpaRepository<ItemEntity, Long> {

}
