public class Customer {

    private int customerNumber;
    private String customerName;
    private String customerLastName;
    private String customerFirstName;
    private String phone;
    private String addres1;
    private String adress2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private int employeeNumber;
    private double credit;

    public Customer(int customerNumber, String customerName, String customerLastName, String customerFirstName, String phone, String addres1, String adress2, String city, String state, String postalCode, String country, int employeeNumber, double credit) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerLastName = customerLastName;
        this.customerFirstName = customerFirstName;
        this.phone = phone;
        this.addres1 = addres1;
        this.adress2 = adress2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.employeeNumber = employeeNumber;
        this.credit = credit;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres1() {
        return addres1;
    }

    public void setAddres1(String addres1) {
        this.addres1 = addres1;
    }

    public String getAdress2() {
        return adress2;
    }

    public void setAdress2(String adress2) {
        this.adress2 = adress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", customerName='" + customerName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", phone='" + phone + '\'' +
                ", addres1='" + addres1 + '\'' +
                ", adress2='" + adress2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", credit=" + credit +
                '}';
    }
}
