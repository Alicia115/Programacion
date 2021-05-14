package U9_T1;

public class Producto {

    private String productCode;
    private String name;
    private String productLine;
    private String Scale;
    private String Vendor;
    private String Descrip;
    private int quanty;
    private double price;
    private double msr;

    public Producto(String productCode, String name, String productLine, String scale, String vendor, String descrip, int quanty, double price, double msr) {
        this.productCode = productCode;
        this.name = name;
        this.productLine = productLine;
        Scale = scale;
        Vendor = vendor;
        Descrip = descrip;
        this.quanty = quanty;
        this.price = price;
        this.msr = msr;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        Scale = scale;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String descrip) {
        Descrip = descrip;
    }

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMsr() {
        return msr;
    }

    public void setMsr(double msr) {
        this.msr = msr;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", productLine='" + productLine + '\'' +
                ", Scale='" + Scale + '\'' +
                ", Vendor='" + Vendor + '\'' +
                ", Descrip='" + Descrip + '\'' +
                ", quanty=" + quanty +
                ", price=" + price +
                ", msr=" + msr +
                '}';
    }
}
