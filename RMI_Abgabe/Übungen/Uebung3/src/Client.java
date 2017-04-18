/**
 * Created by Home on 08.04.2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client implements Serializable {

    public static void main(String[] args) {
        try {

            String host;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Adresse eingeben(127.0.0.1) oder Entertaste betätigen:");
            host = reader.readLine();

            Registry registry = LocateRegistry.getRegistry(host,1099); //Portnr für RMI-Registry
            Antwort a = (Antwort) registry.lookup("X");
            Client c = new Client();

            System.out.println("Frage stellen:");
            String enter = reader.readLine();
            a.Antwort(enter, c);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Client beendet!");
    }

    public void Ausgeben(String antwort){

        System.out.println("Antwort: " + antwort);

    }

}
