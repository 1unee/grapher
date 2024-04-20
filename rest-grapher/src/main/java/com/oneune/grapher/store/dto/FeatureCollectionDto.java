package com.oneune.grapher.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class FeatureCollectionDto {
    private String type;
    private String name;
    private CrsDto crs;
    private List<FeatureDto> features;
}
