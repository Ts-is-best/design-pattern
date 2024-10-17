package remoteproxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = { "rmi://localhost/gumballmachine0",
                "rmi://localhost/gumballmachine1",
                "rmi://localhost/gumballmachine2" };
        GumballMonitor[] monitors = new GumballMonitor[location.length];

        for (int i = 0; i < location.length; i++) {
            try {
                Registry registry = LocateRegistry.getRegistry("localhost", 1099);
                GumballMachineRemote machine = (GumballMachineRemote) registry.lookup("gumballmachine" + i);
                monitors[i] = new GumballMonitor(machine);
                System.out.println("GumballMachine " + i + " located. Preparing to report...");
            } catch (Exception e) {
                System.err.println("Client exception for machine " + i + ": " + e.toString());
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitors.length; i++) {
            if (monitors[i] != null) {
                System.out.println("\nGumball Machine " + i + " Report:");
                monitors[i].report();
            } else {
                System.out.println("\nMonitor " + i + " is null. Skipping report.");
            }
        }
    }
}