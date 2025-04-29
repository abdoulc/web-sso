package com.abdoulc.awesome.app.domain.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Item {
    Long id;
    String title;
    String description;
}
