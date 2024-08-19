package com.example.order.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

@Converter
public class MapToJsonConverter implements AttributeConverter<Map<Integer, Integer>, String> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(Map<Integer, Integer> map) {
        try {
            return objectMapper.writeValueAsString(map);
        } catch (Exception e) {
            throw new RuntimeException("Error converting map to JSON", e);
        }
    }

    @Override
    public Map<Integer, Integer> convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, new TypeReference<Map<Integer, Integer>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Error converting JSON to map", e);
        }
    }
}
