public class Payment {

    private int customerNumber;
    private String checkNumber;
    private String date;
    private double amount;

    public Payment(int customerNumber, String checkNumber, String date, double amount) {
        this.customerNumber = customerNumber;
        this.checkNumber = checkNumber;
        this.date = date;
        this.amount = amount;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "customerNumber=" + customerNumber +
                ", checkNumber='" + checkNumber + '\'' +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                '}';
    }
}
