package com.oneune.grapher.store.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CrsDto {
    private String type;
    private CrsPropertiesDto properties;
}
