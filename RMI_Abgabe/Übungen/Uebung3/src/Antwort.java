/**
 * Created by Home on 08.04.2017.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Antwort extends Remote {

    void Antwort(String i, Client c) throws RemoteException;
}
