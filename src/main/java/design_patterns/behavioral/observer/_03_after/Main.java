package main.java.design_patterns.behavioral.observer._03_after;

public class Main {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetViewCount3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetViewCount5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetViewCount3);
        scoreRecord.attach(dataSheetViewCount5);
        scoreRecord.attach(minMaxView);

        printScore(scoreRecord);

        System.out.println();

        scoreRecord.detach(dataSheetViewCount5);
        printScore(scoreRecord);
    }

    private static void printScore(ScoreRecord scoreRecord) {
        for (int i = 0; i < 5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
