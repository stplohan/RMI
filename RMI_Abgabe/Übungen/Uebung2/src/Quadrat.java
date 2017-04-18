/**
 * Created by Home on 04.05.2017.
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Quadrat extends Remote {

    long quadrat(long i) throws RemoteException;
}
