package chapter03.DIP;

public class Main {
    public static void main(String[] args) {
        Toy robot = new Robot();

        Kid kid = new Kid();
        kid.setToy(robot);
        kid.play();

        Toy lego = new Lego();
        kid.setToy(lego);
        kid.play();
    }
}
