package com.hibernate.mapping.OnetoOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
    
    @Id
    @Column(name="question_id")
    private int questionId;
    @Column(length = 200)
    private String question;
    @OneToOne
    @JoinColumn(name = "answer_key")
    private Answer answer;

    public Question(int questionId, String question , Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question(){
        super();
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    
}
