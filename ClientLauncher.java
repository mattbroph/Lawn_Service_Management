import java.util.*;
/** Obtains client data from the user and adds it to an array
 * Calls several methods to calculate and print reports to the terminal
 * 
 * @author Matt Brophy
 */


public class ClientLauncher {
    
    private InputHelper input;
    private ArrayList<Client> clients;
    private DataProcessor data = new DataProcessor();
    
    /** Kicks off the proceess of gathering input and creating clients
     * then calls various methods to calculate and display reports
     */
    public void run() {
        createClient();
        displayClientReport();
        displaySummaryReport();
    }

    /** Creates a Client object, stores it in an array and stores client
     * attributes given by the user.
     */
    public void createClient() {
        clients = new ArrayList<Client>();
        input = new InputHelper();

        String name = "";
        String lengthString = "";
        String widthString = "";
        String paymentsString = "";
        double length = 0;
        double width = 0;
        int payments = 0;
        Client newClient = null;
        String again = "";

        while (true) {
            name = input.getUserInput("Enter the name of a new client");
            lengthString = input.getUserInput("Enter the length of the" 
                    + " client's lawn in yards: ");
            widthString = input.getUserInput("Enter the width of the client's "
                    + "lawn in yards");
            paymentsString = input.getUserInput("Enter the number of payments"
                    + " that the client will be making. The choices are 1, "
                    + "2 or 22.");
            
            length = Double.parseDouble(lengthString);
            width = Double.parseDouble(widthString);
            payments = Integer.parseInt(paymentsString);
            
            newClient = new Client();
            newClient.setClientName(name);
            newClient.setLawnLength(length);
            newClient.setLawnWidth(width);
            newClient.setNumberOfPayments(payments);
            clients.add(newClient);

            again = input.getUserInput("Would you like to enter another"
                    + " client? Enter 'y' to continue or 'n' to exit.");

            if(again.equals("n")) {
                break;
            }
        }
    }

    /** Calls the clientReport method on each client in the array
     * Displays the results to the terminal
     */
    public void displayClientReport() {
        
        Client client = null;

        for (int index = 0; index < clients.size(); index++) {
            client = clients.get(index);
            data.calculateCharge(client);
            System.out.println(client.clientReport());
            System.out.println();
        }
    }

    /** Calls the calculate summary report on the clients array
     * A string is returned which is printed to the terminal
     */
    public void displaySummaryReport() {

        System.out.println(data.calculateSummaryReport(clients));

    }

}
