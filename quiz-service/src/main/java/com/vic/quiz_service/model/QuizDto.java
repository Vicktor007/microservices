package com.vic.quiz_service.model;

import lombok.Data;

@Data
public class QuizDto {
    String categoryName;
    Integer numQuestions;

    public String getCategoryName() {
        return categoryName;
    }

    public Integer getNumQuestions() {
        return numQuestions;
    }

    public String getTitle() {
        return title;
    }

    String title;
}
