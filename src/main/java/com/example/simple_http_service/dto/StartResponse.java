package com.example.simple_http_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StartResponse {
    private String message;
}
