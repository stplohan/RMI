/**
 * Created by Home on 04.05.2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class QuadratClient {

    public static void main(String[] args) {
        try {

            String host = "127.0.0.1";

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Adresse eingeben(127.0.0.1) oder Entertaste betätigen:");
            host = reader.readLine();

            Registry registry = LocateRegistry.getRegistry(host,1099); //Portnr für RMI-Registry
            Quadrat h = (Quadrat) registry.lookup("X");


            System.out.println("Zahl eingeben, die quadriert werden soll:");
            String enter= reader.readLine();

            long erg = h.quadrat(Integer.parseInt(enter));

            System.out.println("Ergebniss: "+ erg);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
