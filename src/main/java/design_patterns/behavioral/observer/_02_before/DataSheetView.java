package main.java.design_patterns.behavioral.observer._02_before;

import java.util.Collections;
import java.util.List;

public class DataSheetView {
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record, viewCount);
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
