package chapter05.strategy;

public abstract class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 로봇마다 move, attack 기능이 다르기 때문에 자식클래스에서 정의하도록 함
    public abstract void attack();
    public abstract void move();

}
