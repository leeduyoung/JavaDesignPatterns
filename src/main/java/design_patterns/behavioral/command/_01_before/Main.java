package main.java.design_patterns.behavioral.command._01_before;

/**
 * 1. 버튼을 눌렀을때 램프가 켜지는 대신 다른 기능을 실행하게 하려면 어떤 변경을 해야하는가?
 * 예를들어, 버튼을 눌렀을때 알람이 실행되게 하려면?
 *
 * 2. 버튼을 누르는 동작에 따라서 다른 기능을 실행하게 하려면 어떻게 해야하는가?
 * 예를들어, 버튼을 처음 눌렀을때 램프를 켜고 두번째 눌렀을땐 알람을 동작하게 하려면?
 */

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);

        button.pressed();
    }
}
