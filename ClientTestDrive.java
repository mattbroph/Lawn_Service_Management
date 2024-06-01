/** Contains the main method for the ClientTestDrive class
 * Will kick off the client launcher process
 * @author Matt Brophy
 */

public class ClientTestDrive {
    
    /** The main method which instantiates a client launcher object 
     * and calls the run method
     * @param args the command line arguments (not used here)
     */
    public static void main(String[] args) {

        ClientLauncher client1 = new ClientLauncher();

        client1.run();

    }
}
