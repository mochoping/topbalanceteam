package com.topBalance.wishTree.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BalanceQ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;
    private int question;
    private boolean answerleft;
    private int scoreS;
    private int scoreC;
    private int scoreH;
    private int scoreD;

    public boolean getAnswerLeft() {
        return answerleft;
    }

    public void setAnswerLeft(boolean answerleft) {
        this.answerleft = answerleft;
    }
}
