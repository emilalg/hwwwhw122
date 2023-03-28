/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package memento;

public class App {

    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        int numberOfClients = 5;

        for (int i = 0; i < numberOfClients; i++) {
            Asiakas asiakas = new Asiakas(arvuuttaja);
            Thread asiakasThread = new Thread(asiakas, "Asiakas " + (i + 1));
            asiakasThread.start();
        }
    }
}