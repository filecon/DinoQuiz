package com.example.sam.dinoquiz;

/**
 * Created by Sam on 9/08/16.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }

    public TrueFalse (int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
