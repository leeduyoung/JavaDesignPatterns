package main.java.design_patterns.behavioral.observer._02_before;

/**
 * 성적을 다양한 형태로 여러가지 출력하도록 구현
 */

public class Main {

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);

        scoreRecord.setDataSheetView(dataSheetView);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
