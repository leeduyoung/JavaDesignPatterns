package main.java.design_patterns.behavioral.command._02_before;

/**
 * 버튼을 눌렀을때 알람이 동작하게 코드를 작성하였다.
 * 기능을 변경하기 위해서 코드를 수정해야하는 것은 OCP에 위배된다.
 */

public class Main {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Button button = new Button(alarm);

        button.pressed();
    }
}

