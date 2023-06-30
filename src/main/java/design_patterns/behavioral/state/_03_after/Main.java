package main.java.design_patterns.behavioral.state._03_after;

/**
 * _02_after 에서는 개선할 부분이 있었다.
 * 상태 변화가 생길 때마다 새로운 상태 객체를 생성하므로
 * 메모리 낭비와 성능 저하를 가져올 수 있기 때문이다.
 * 대부분 상태 객체는 한번만 생성해도 충분하다.
 * 싱글턴 패턴을 적용하면 더 효율적인 코드를 만들 수 있다.R
 */

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        light.offButtonPushed();
        light.onButtonPushed();
        light.onButtonPushed();
        light.onButtonPushed();
        light.offButtonPushed();
    }
}
