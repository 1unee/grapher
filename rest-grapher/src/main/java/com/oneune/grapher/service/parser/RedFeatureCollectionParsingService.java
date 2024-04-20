package com.oneune.grapher.service.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneune.grapher.store.dto.red.RedFeatureCollectionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RedFeatureCollectionParsingService {

    private final ObjectMapper objectMapper;
}
