package com.abdoulc.awesome.app.domain.service;

import com.abdoulc.awesome.app.domain.model.Item;
import com.abdoulc.awesome.app.domain.port.ItemRepository;
import com.abdoulc.awesome.app.domain.port.ItemUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class ItemUseCaseImpl implements ItemUseCase {
    final ItemRepository itemRepository;

    @Autowired
    public ItemUseCaseImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> getItem() {
        return itemRepository.getItem();
    }
}
