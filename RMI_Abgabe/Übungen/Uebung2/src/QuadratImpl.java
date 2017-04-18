/**
 * Created by Home on 04.05.2017.
 */

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class QuadratImpl extends UnicastRemoteObject implements Quadrat {

    public QuadratImpl() throws RemoteException {

    }

    public long quadrat(long i) {
        return i * i;
    }

}