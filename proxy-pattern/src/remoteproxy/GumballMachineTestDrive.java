package remoteproxy;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote[] gumballMachines = new GumballMachineRemote[3];
        String[] locations = {"Seattle", "New York", "San Francisco"};
        int[] inventories = {112, 250, 75};

        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            
            for (int i = 0; i < 3; i++) {
                gumballMachines[i] = new GumballMachine(locations[i], inventories[i]);
                registry.rebind("gumballmachine" + i, gumballMachines[i]);
                System.out.println("GumballMachine " + locations[i] + " bound. Server is running...");
            }
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}