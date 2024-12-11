package com.vic.quiz_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    public void setQuestionIds(List<Integer> questionIds) {
        this.questionIds = questionIds;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ElementCollection
    private List<Integer> questionIds;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Integer> getQuestionIds() {
        return questionIds;
    }
}
