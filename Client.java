/** Contains data on the Client class.
 * Has getters and setters to allow access to instance variables.
 * Has a client report method that returns a string to be printed to the 
 * terminal.
 * 
 * @author Matt Brophy
 */


public class Client {

    private String clientName;
    private double lawnLength;
    private double lawnWidth;
    private int numberOfPayments;

    private double totalSeasonCharge;
    private double paymentAmount;
    private double lawnSquareYards;

    /** Gets the lawn square yards
     * @return the lawn square yards
     */
    public double getLawnSquareYards() {
        return this.lawnSquareYards;
    }

    /** Sets the lawn square yards
     * @param  lawnSquareYards the lawn square yards
     */
    public void setLawnSquareYards(double lawnSquareYards) {
        this.lawnSquareYards = lawnSquareYards;
    }


    /** Gets the total season charge
     * @return the total season charge
     */
    public double getTotalSeasonCharge() {
        return this.totalSeasonCharge;
    }

    /** Sets the total season charge
     * @param  totalSeasonCharge the total season charge
     */
    public void setTotalSeasonCharge(double totalSeasonCharge) {
        this.totalSeasonCharge = totalSeasonCharge;
    }
    

    /** Gets the client payment amount
     * @return the client payment amount
     */
    public double getPaymentAmount() {
        return this.paymentAmount;
    }

    /** Sets the client payment amount
     * @param  paymentAmount the client payment amount
     */
    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }


    /** Gets the client name attribute
     * @return the client name value
     */
    public String getClientName() {
        return this.clientName;
    }

    /** Sets the client name attribute
     * @param  clientName  The client name value
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    
    /** Gets the lawn length attribute
     * @return the lawn length value
     */
    public double getLawnLength() {
        return this.lawnLength;
    }

    /** Sets the lawn length attribute
     * @param  lawnLength  The lawn length value
     */
    public void setLawnLength(double lawnLength) {
        this.lawnLength = lawnLength;
    }

    
    /** Gets the lawn width attribute
     * @return the lawn width value
     */
    public double getLawnWidth() {
        return this.lawnWidth;
    }

    /** Sets the lawn width attribute
     * @param  lawnWidth  The lawn width value
     */
    public void setLawnWidth(double lawnWidth) {
        this.lawnWidth = lawnWidth;
    }


    /** Gets the number of payments attribute
     * @return the number of payments value
     */
    public int getNumberOfPayments() {
        return this.numberOfPayments;
    }

    /** Sets the number of payments attribute
     * @param  numberOfPayments  The number of payments value
     */
    public void setNumberOfPayments(int numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }


    /** Returns the client report which includes several of the client
     * attributes
     * @return the client report
     */
    public String clientReport() {

        String formattedPaymentAmount 
                = String.format("%,.2f", getPaymentAmount());

        String formattedTotalSeasonCharge
                = String.format("%,.2f", getTotalSeasonCharge());

        String formattedLawnSquareYards
                = String.format("%,.2f", getLawnSquareYards());
               
        return "Client:" + getClientName()
                + "\nLawn Size: " + formattedLawnSquareYards + " sq. yds."
                + "\nNumber of Payments: " + getNumberOfPayments()
                + "\nAmount of each payment: $" + formattedPaymentAmount
                + "\nTotal of all payments: $" + formattedTotalSeasonCharge;
    }
}
