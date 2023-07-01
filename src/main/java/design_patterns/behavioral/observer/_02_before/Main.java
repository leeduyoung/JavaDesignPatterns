package main.java.design_patterns.behavioral.observer._02_before;

/**
 * 성적을 다양한 형태로 여러가지 출력하도록 구현
 *
 * 점수가 입력되었을 때 DataSheetView 클래스에게 고정적으로 통보하도록 코딩 되어있는데
 * MinMaxView에게 통보하려면 ScoreRecord 클래스의 변경이 불가피하다.
 * 이는 OCP에 위배된다.
 *
 * 문제 해결의 핵심은 성적 통보 대상이 변경되더라도 ScoreRecord 클래스를
 * 그대로 재사용할 수 있어야 한다. 따라서, ScoreRecord 클래스에서 변화되는 부분을 식별하고
 * 이를 일반화시켜야 한다.
 * 통보 대상인 객체를 참조하는 것을 관리해야하며 addScore 메서드는 각 통보 대상인 객체의
 * update 메서드를 호출해야한다.
 */

public class Main {

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.setDataSheetView(dataSheetView);
        scoreRecord.setStatisticsView(minMaxView);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
