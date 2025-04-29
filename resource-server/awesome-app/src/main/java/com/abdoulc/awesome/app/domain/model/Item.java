package com.abdoulc.awesome.app.domain.model;

import lombok.Builder;
import lombok.Value;
import java.util.List;

@Value
@Builder
public class Item {
    String id;
    String title;
    String description;
    String category;
    List<String> imageUrls;
}
