/**
 * Created by Home on 08.04.2017.
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AntwortImpl extends UnicastRemoteObject implements Antwort {

    public AntwortImpl() throws RemoteException {

    }

    public void Antwort(String i, Client c) {
        try {
            Thread.sleep(10); // 10 nur für Tests verwändet.

        } catch (Exception e) {
        }
        c.Ausgeben("Die Antwort auf  <" + i + "> ist wahrscheinlich 61!");
    }

}
