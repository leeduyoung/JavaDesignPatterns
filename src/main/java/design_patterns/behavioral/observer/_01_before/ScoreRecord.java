package main.java.design_patterns.behavioral.observer._01_before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List scores = new ArrayList<Integer>(); // 점수를 저장
    private DataSheetView dataSheetView; // 목록 형태로 점수를 출력하는 클래스

    public void setDataSheetView(DataSheetView dataSheetView) {
        this.dataSheetView = dataSheetView;
    }

    public void addScore(int score) {
        scores.add(score);
        dataSheetView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
