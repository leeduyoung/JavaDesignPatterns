package main.java.design_patterns.behavioral.observer._02_before;

import java.util.Collections;
import java.util.List;

public class MinMaxView {
    
    private ScoreRecord scoreRecord;
    
    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }


    public void update() {
        List<Integer> scores = this.scoreRecord.getScoreRecord();
        displayScores(scores);
    }

    private void displayScores(List<Integer> scores) {
        Integer min = Collections.min(scores);
        Integer max = Collections.max(scores);
        System.out.println("Min score: " +  min);
        System.out.println("Max score: " +  max);
    }
}
