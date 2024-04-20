package com.oneune.grapher.service;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.oneune.grapher.store.dto.FeatureCollectionDto;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;


@Service
public class GeoJsonParsingService {

    public FeatureCollectionDto getParsedFeatureCollectionFromGeoJsonFile(String filename) {
        Gson gson = new Gson();
        try (JsonReader reader = new JsonReader(new FileReader(filename))) {
            return gson.fromJson(reader, FeatureCollectionDto.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
