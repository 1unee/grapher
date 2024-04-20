package com.oneune.grapher.service.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneune.grapher.store.dto.red.RedFeatureCollectionDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;


@Service
@RequiredArgsConstructor
@Log4j2
public class RedFeatureCollectionParsingService {

    private final ObjectMapper objectMapper;

    public RedFeatureCollectionDto parseRedFeatureCollectionFile(String filePath) {
        File file = new File(filePath);
        try {
            return objectMapper.readValue(file, RedFeatureCollectionDto.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
