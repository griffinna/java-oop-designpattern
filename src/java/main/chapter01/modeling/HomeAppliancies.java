package chapter01.modeling;

public abstract class HomeAppliancies {
    private int serialNo;
    private String manufactuer;
    private int year;

    public abstract void turnOn();

    public abstract void turnOff();
}
