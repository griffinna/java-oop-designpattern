package chapter03.OCP;

public class Main {
    public static void main(String[] args) {
        FuelTankMonitoring monitoring = new FuelTankMonitoring();
        monitoring.checkAndWarn();

        monitoring = new FuelTankMonitoringWith();
        monitoring.checkAndWarn();
    }
}
