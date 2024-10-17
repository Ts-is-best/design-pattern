package remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface State extends Remote {
    public String toString() throws RemoteException;
}