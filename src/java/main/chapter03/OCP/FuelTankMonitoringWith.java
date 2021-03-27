package chapter03.OCP;

public class FuelTankMonitoringWith extends FuelTankMonitoring {

    @Override
    protected boolean checkFuelTank(String a) {
        System.out.println("FuelTankMonitoringWith ... ");
        return true;
    }

    @Override
    protected void giveWarningSignal(String a) {
        System.out.println("FuelTankMonitoringWith ... warning");
    }
}
