package chapter03.OCP;

public class FuelTankMonitoring {
    public void checkAndWarn() {

        if(checkFuelTank("A")) {
            giveWarningSignal("A");
        }
    }

    protected void giveWarningSignal(String a) {
        System.out.println("FuelTankMonitoring... warning");
    }

    protected boolean checkFuelTank(String a) {
        return true;
    }
}
