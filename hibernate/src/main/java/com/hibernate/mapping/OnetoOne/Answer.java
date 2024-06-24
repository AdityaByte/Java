package com.hibernate.mapping.OnetoOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    @Column(name="answer_id")
    private int answerId;

    @Column(length = 300)
    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }
    public Answer(){
        super();
    }
    public int getAnswerId() {
        return answerId;
    }
    public String getAnswer() {
        return answer;
    }
    public Question getQuestion() {
        return question;
    }

    
}
