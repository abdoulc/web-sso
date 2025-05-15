package com.abdoulc.awesome.app.domain.port;

import com.abdoulc.awesome.app.domain.model.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> getItem();
}
