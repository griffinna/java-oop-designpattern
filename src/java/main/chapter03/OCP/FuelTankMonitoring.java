package chapter03.OCP;

public class FuelTankMonitoring {
    public void checkAndWarn() {

        if(checkFuelTank("A")) {
            giveWarningSignal("A");
        }
    }

    private void giveWarningSignal(String a) {
        System.out.println();
    }

    private boolean checkFuelTank(String a) {
        return false;
    }
}
