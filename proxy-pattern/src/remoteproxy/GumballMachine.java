package remoteproxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private static final long serialVersionUID = 2L;
    private String location;
    private int count;
    private String state;

    public GumballMachine(String location, int count) throws RemoteException {
        this.location = location;
        this.count = count;
        this.state = "waiting for quarter";
    }

    public int getCount() throws RemoteException {
        return count;
    }

    public String getLocation() throws RemoteException {
        return location;
    }

    public String getState() throws RemoteException {
        return state;
    }
}