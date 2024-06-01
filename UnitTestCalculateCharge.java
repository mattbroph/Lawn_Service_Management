/** This unit test will cover all scenarios of the calculate
 * charge method and test out it's calculations
 * @author Matt Brophy
 */

public class UnitTestCalculateCharge {

    /** The main method which instantiates a DataProcessor object
     * Creates an array of clients, sets their values and then calls
     * the calculate charge method.
     * @param args the command line arguments (not used here)
     */
    public static void main(String[] args) {

        // Instantiate object
        DataProcessor data = new DataProcessor();

        // Create arrays
        Client[] clients = new Client[9];
        double[] expectedTotalSeasonCharges = new double[9];
        double[] expectedPaymentAmounts = new double[9];
        double[] expectedLawnSquareYards = new double[9];

        // Create client objects
        clients[0] = new Client();
        clients[1] = new Client();
        clients[2] = new Client();
        clients[3] = new Client();
        clients[4] = new Client();
        clients[5] = new Client();
        clients[6] = new Client();
        clients[7] = new Client();
        clients[8] = new Client();

        // *** SMALL LAWNS *** //

        // Populate small lawn 1 payment
        clients[0].setClientName("Small Lawn 1 Payment");
        clients[0].setLawnLength(20);
        clients[0].setLawnWidth(22);
        clients[0].setNumberOfPayments(1);

        expectedTotalSeasonCharges[0] = 550;
        expectedPaymentAmounts[0] = 550;
        expectedLawnSquareYards[0] = 440;

        // Populate small lawn 2 payments (edge case)
        clients[1].setClientName("Small Lawn 2 Payments");
        clients[1].setLawnLength(249.5);
        clients[1].setLawnWidth(2);
        clients[1].setNumberOfPayments(2);

        expectedTotalSeasonCharges[1] = 560;
        expectedPaymentAmounts[1] = 280;
        expectedLawnSquareYards[1] = 499;

        // Populate small lawn 22 payments
        clients[2].setClientName("Small Lawn 22 Payments");
        clients[2].setLawnLength(20);
        clients[2].setLawnWidth(20);
        clients[2].setNumberOfPayments(22);

        expectedTotalSeasonCharges[2] = 616;
        expectedPaymentAmounts[2] = 28;
        expectedLawnSquareYards[2] = 400;


        // *** MEDIUM LAWNS *** //

        // Populate medium lawn 1 payment
        clients[3].setClientName("Medium Lawn 1 Payment");
        clients[3].setLawnLength(30);
        clients[3].setLawnWidth(20);
        clients[3].setNumberOfPayments(1);

        expectedTotalSeasonCharges[3] = 770;
        expectedPaymentAmounts[3] = 770;
        expectedLawnSquareYards[3] = 600;

        // Populate medium lawn 2 payments (edge case 500)
        clients[4].setClientName("Medium Lawn 2 Payments");
        clients[4].setLawnLength(250);
        clients[4].setLawnWidth(2);
        clients[4].setNumberOfPayments(2);

        expectedTotalSeasonCharges[4] = 780;
        expectedPaymentAmounts[4] = 390;
        expectedLawnSquareYards[4] = 500;

        // Populate medium lawn 22 payments (edge case 800)*
        clients[5].setClientName("Medium Lawn 22 Payments");
        clients[5].setLawnLength(399.5);
        clients[5].setLawnWidth(2);
        clients[5].setNumberOfPayments(22);

        expectedTotalSeasonCharges[5] = 836;
        expectedPaymentAmounts[5] = 38;
        expectedLawnSquareYards[5] = 799;


        // *** LARGE LAWNS *** //

        // Populate large lawn 1 payment
        clients[6].setClientName("Large Lawn 1 Payment");
        clients[6].setLawnLength(50);
        clients[6].setLawnWidth(30);
        clients[6].setNumberOfPayments(1);

        expectedTotalSeasonCharges[6] = 1100;
        expectedPaymentAmounts[6] = 1100;
        expectedLawnSquareYards[6] = 1500;

        // Populate large lawn 2 payments (edge case)
        clients[7].setClientName("Large Lawn 2 Payments");
        clients[7].setLawnLength(400);
        clients[7].setLawnWidth(2);
        clients[7].setNumberOfPayments(2);

        expectedTotalSeasonCharges[7] = 1110;
        expectedPaymentAmounts[7] = 555;
        expectedLawnSquareYards[7] = 800;

        // Populate large lawn 22 payments
        clients[8].setClientName("Large Lawn 22 Payments");
        clients[8].setLawnLength(80);
        clients[8].setLawnWidth(40);
        clients[8].setNumberOfPayments(22);

        expectedTotalSeasonCharges[8] = 1166;
        expectedPaymentAmounts[8] = 53;
        expectedLawnSquareYards[8] = 3200;


        /* Call calculate charge method on each client
         * then check the calculation results and display success or failure
         * message to the terminal for each value
         */
        for (int index = 0; index < clients.length; index++) {

            System.out.println("Test Case: " + clients[index].getClientName());

            data.calculateCharge(clients[index]);


            if (clients[index].getTotalSeasonCharge()
                     == expectedTotalSeasonCharges[index]) {
                System.out.println("Total Season Charge: Expected: "
                         + expectedTotalSeasonCharges[index] + " , Actual: "
                         + (clients[index].getTotalSeasonCharge())
                         + " - Calculation PASSED");
            } else {
                System.out.println("Total Season Charge: Expected: "
                         + expectedTotalSeasonCharges[index] + " , Actual: "
                         + (clients[index].getTotalSeasonCharge())
                         + " - Calculation FAILED");
            }


            if (clients[index].getPaymentAmount()
                     == expectedPaymentAmounts[index]) {
                System.out.println("Payment Amount: Expected: "
                        + expectedPaymentAmounts[index] + " , Actual: "
                        + (clients[index].getPaymentAmount())
                        + " - Calculation PASSED");
           } else {
                System.out.println("Total Season Charge: Expected: "
                        + expectedPaymentAmounts[index] + " , Actual: "
                        + (clients[index].getPaymentAmount())
                        + " - Calculation FAILED");
           }


            if (clients[index].getLawnSquareYards()
                     == expectedLawnSquareYards[index]) {
                System.out.println("Lawn Square Yards: Expected: "
                        + expectedLawnSquareYards[index] + " , Actual: "
                        + (clients[index].getLawnSquareYards())
                        + " - Calculation PASSED");
           } else {
                System.out.println("Total Season Charge: Expected: "
                        + expectedLawnSquareYards[index] + " , Actual: "
                        + (clients[index].getLawnSquareYards())
                        + " - Calculation FAILED");
           }

            System.out.println();
        }
    }

}