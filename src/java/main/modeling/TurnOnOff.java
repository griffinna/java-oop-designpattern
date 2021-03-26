package modeling;

public class TurnOnOff {
    public static void main(String[] args) {

        HomeAppliancies homeAppliancies = new Washer();
        homeAppliancies.turnOn();
        homeAppliancies.turnOff();

        homeAppliancies = new DishWasher();
        homeAppliancies.turnOn();
        homeAppliancies.turnOff();

        homeAppliancies = new Freezer();
        homeAppliancies.turnOn();
        homeAppliancies.turnOff();

    }
}
