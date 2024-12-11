package com.vic.question_service.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class QuestionWrapper {

    @JsonProperty("id") private Integer id; @JsonProperty("questionTitle") private String questionTitle; @JsonProperty("option1") private String option1; @JsonProperty("option2") private String option2; @JsonProperty("option3") private String option3; @JsonProperty("option4") private String option4;

    public QuestionWrapper() { // No-argument constructor
        }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
