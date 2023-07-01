package main.java.design_patterns.behavioral.observer._03_after;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {

    List<Integer> scores = new ArrayList<Integer>();

    public ScoreRecord() {
    }

    public void addScore(int score) {
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScoreRecord() {
        return this.scores;
    }
}
