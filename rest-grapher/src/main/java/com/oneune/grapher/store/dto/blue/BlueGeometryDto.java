package com.oneune.grapher.store.dto.blue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlueGeometryDto {
    private String type;
    private List<List<List<Double>>> coordinates;
}
