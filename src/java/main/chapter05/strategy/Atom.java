package chapter05.strategy;

public class Atom extends Robot {

    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have strong punch and can attack with it.");
    }

    @Override
    public void move() {
//        System.out.println("I can fly.");
        System.out.println("I can only walk."); // 기존 로봇의 이동방법 수정
    }
}
