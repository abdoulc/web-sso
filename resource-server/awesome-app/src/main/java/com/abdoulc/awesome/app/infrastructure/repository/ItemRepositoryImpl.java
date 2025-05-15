package com.abdoulc.awesome.app.infrastructure.repository;


import com.abdoulc.awesome.app.domain.model.Item;
import com.abdoulc.awesome.app.domain.port.ItemRepository;
import com.abdoulc.awesome.app.infrastructure.entity.ItemEntity;
import com.abdoulc.awesome.app.infrastructure.repository.data.ItemDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {
    private final ItemDataRepository itemDataRepository;

    @Autowired
    public ItemRepositoryImpl(ItemDataRepository itemDataRepository) {
        this.itemDataRepository = itemDataRepository;
    }

    @Override
    public List<Item> getItem() {
        List<ItemEntity> entities = itemDataRepository.findAll();
        return entities.stream()
                .map(itemEntity -> Item.builder().title(itemEntity.getTitle()).build())
                .toList();
    }
}
