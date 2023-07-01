package main.java.design_patterns.behavioral.observer._03_after;

import java.util.Collections;
import java.util.List;

public class DataSheetView implements Observer {
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }


    @Override
    public void update() {
        List<Integer> scores = this.scoreRecord.getScoreRecord();
        displayScores(scores, this.viewCount);
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");

        Collections.sort(record, Collections.reverseOrder());
        for (int i = 0; i <viewCount && i < record.size(); i++) {
            System.out.println(record.get(i) + " ");
        }
        System.out.println();
    }
}
