import java.util.*;
/** Contains methods that calculate data based on client attributes
 * @author Matt Brophy
 */


public class DataProcessor {

    /** Calculates how much to charge the client and sets those values
     * @param client the current client in the array
     */
    public void calculateCharge(Client client) {

        // Declare constants
        final double SMALL_YARD = 500;
        final double LARGE_YARD = 800;
        final double SEASON_WEEKS = 22;
    
        final double FEE_SMALL_YARD = 25;
        final double FEE_MEDIUM_YARD = 35;
        final double FEE_LARGE_YARD = 50;
    
        final double SERVICE_CHARGE_ONE = 0;
        final double SERVICE_CHARGE_TWO = 5;
        final double SERVICE_CHARGE_TWENTY_TWO = 3;
    
        // Declare variables
        double seasonCharge = 0;
        double serviceCharge = 0;
        double squareYards = 0;
        double width = client.getLawnWidth();
        double length = client.getLawnLength();
        double payments = client.getNumberOfPayments();
    
        // Determine square yards
        squareYards = width * length;
    
        // Determine season charge
        if (squareYards < SMALL_YARD) {
            seasonCharge = FEE_SMALL_YARD * SEASON_WEEKS;
        } else if (squareYards >= SMALL_YARD && squareYards < LARGE_YARD) {
            seasonCharge = FEE_MEDIUM_YARD * SEASON_WEEKS;
        } else if (squareYards >= LARGE_YARD) {
            seasonCharge = FEE_LARGE_YARD * SEASON_WEEKS;
        }
    
        // Determine service charge
        if (payments == 1) {
            serviceCharge = SERVICE_CHARGE_ONE;
        } else if (payments == 2) {
            // $5 per payment
            serviceCharge = SERVICE_CHARGE_TWO * payments;
        } else if (payments == 22) {
            // $3 per payment
            serviceCharge = SERVICE_CHARGE_TWENTY_TWO * payments;
        }
    
        // Calculate total season charge
        double totalSeasonCharge = serviceCharge + seasonCharge;
   
        // Calculate payment amount
        double paymentAmount = totalSeasonCharge / payments;
    
        // Set client values for client report
        client.setTotalSeasonCharge(totalSeasonCharge);
        client.setPaymentAmount(paymentAmount);
        client.setLawnSquareYards(squareYards);
    }

    /** Calculate and return the summary report so it can be printed
     * to the terminal
     * @param clients the array of clients
     * @return the summary report 
     */
    public String calculateSummaryReport(ArrayList<Client> clients) {

        // Count the number of objects in the array
        int listSize = clients.size();

        // Local variables
        double totalSquareYards = 0;
        double totalYearlyRevenue = 0;
        
        /* Loop through clients array and determine total square yards and
         * total season charges.
         * Return the summary report string that is to be displayed.
        */
        for (Client client : clients) {
            totalSquareYards = client.getLawnSquareYards()
                    + totalSquareYards;
            totalYearlyRevenue = client.getTotalSeasonCharge()
                    + totalYearlyRevenue;
        }

        // Format values
        String formattedTotalYearlyRevenue = 
                String.format("%,.2f", totalYearlyRevenue);

        String formattedTotalSquareYards = 
                String.format("%,.2f", totalSquareYards);

        // Return the summary report string
        return "The Number of Clients: " + listSize
                + "\nTotal square yards to mow: " + formattedTotalSquareYards
                + "\nTotal revenue for the summer: $"
                        + formattedTotalYearlyRevenue;
    }

}
