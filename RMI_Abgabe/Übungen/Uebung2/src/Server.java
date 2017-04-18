/**
 * Created by Home on 04.05.2017.
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String[] args) {
        try {

            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);

            QuadratImpl h = new QuadratImpl();
            UnicastRemoteObject.unexportObject(h,true);

            Quadrat h_stub = (Quadrat) UnicastRemoteObject.exportObject(h,4242);

            registry.bind("X", h_stub);

            System.out.println("Server erfolgreich gestartet..");

        } catch (Exception e) {
            System.err.println("Fehler:" + e);
            e.printStackTrace();
        }


    }
}