package com.abdoulc.awesome.app.web;

import com.abdoulc.awesome.api.ItemsApi;
import com.abdoulc.awesome.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemsApiImpl implements ItemsApi {
    @Override
    public ResponseEntity<List<Item>> getListItems(){
        return null;
    }
}
