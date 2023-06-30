package main.java.design_patterns.behavioral.state._01_before.Main;

public class Light {
    private static int ON = 0;
    private static int OFF = 1;
    private static int SLEEPING = 2;
    private int state;

    public Light() {
        this.state = OFF;
    }

    public void onButtonPushed() {

        /**
         * 복잡한 조건문에 상태 변화가 숨어 있는 경우 상태 변화가 어떻게 이루어지는지 이해하기 어렵고
         * 새로운 상태 추가에 맞춰 모든 메서드를 수정해야 한다.
         */

        if (state == ON) {
            System.out.println("Light Change Sleeping Mode!");
            state = SLEEPING;
        } else if (state == SLEEPING) {
            System.out.println("Light Change On Mode!");
            state = ON;
        }else {
            System.out.println("Light On!");
            state = ON;
        }
    }

    public void offButtonPushed() {
        if (state == ON) {
            System.out.println("Light Off!");
            state = OFF;
        } else if (state == SLEEPING) {
            System.out.println("Light Off!");
            state = OFF;
        }else {
            System.out.println("반응 없음");
        }
    }
}
