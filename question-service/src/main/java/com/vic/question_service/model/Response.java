package com.vic.question_service.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public String getResponse() {
        return response;
    }

    private String response;
}
