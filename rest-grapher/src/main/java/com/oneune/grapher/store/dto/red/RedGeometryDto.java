package com.oneune.grapher.store.dto.red;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class RedGeometryDto {
    private String type;
    private List<List<List<Double>>> coordinates;
}
