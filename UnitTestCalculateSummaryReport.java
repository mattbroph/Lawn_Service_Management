import java.util.*;
/** The unit test for the calculate summary report
 * @author Matt Brophy
 */

public class UnitTestCalculateSummaryReport {

    /** This unit test will create an array list of clients and set the
     * required attributes for the calculate summary report. It will then run
     * the method and compare the results and output a pass or fail message
     * @param args the command line arguments (not used here)
     */
    public static void main(String[] args) {

        // Create a DataProcesser object
        DataProcessor data = new DataProcessor();
        
        // Create array list
        ArrayList<Client> clients = new ArrayList<Client>();

        // Add clients to the array list
        Client clientOne = new Client();
        Client clientTwo = new Client();
        Client clientThree = new Client();

        clients.add(clientOne);
        clients.add(clientTwo);
        clients.add(clientThree);

        // Set client attributes
        clientOne.setLawnSquareYards(440);
        clientOne.setTotalSeasonCharge(550);
        clientTwo.setLawnSquareYards(600);
        clientTwo.setTotalSeasonCharge(780);
        clientThree.setLawnSquareYards(5000);
        clientThree.setTotalSeasonCharge(1166);

        // Set the expected report results
        String expectedReportString = "The Number of Clients: 3"
                + "\nTotal square yards to mow: 6,040.00"
                + "\nTotal revenue for the summer: $2,496.00";
        
        // Call the calculate summary report method to test against
        String summaryReport = data.calculateSummaryReport(clients);

        // Display the results of each
        System.out.println("Expected Summary Report String: ");
        System.out.println(expectedReportString);
        System.out.println();
        System.out.println("Actual Summary Report String: ");
        System.out.println(summaryReport);
        System.out.println();

        // Display a pass or fail message
        if (summaryReport.equals(expectedReportString)) {
            System.out.println("Summary Report calculation PASSED");
        } else {
            System.out.println("Summary Report Calculation FAILED");
        }
    }
}
