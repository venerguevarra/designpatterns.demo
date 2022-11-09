package com.bootcamp.patterns.adapter;

public class DogContest {
    private NewTrick dogWithNewTrick;

    public void join(NewTrick dogWithNewTrick) {
        this.dogWithNewTrick = dogWithNewTrick;
    }

    public void perform() {
        this.dogWithNewTrick.doTrick();
    }
}
