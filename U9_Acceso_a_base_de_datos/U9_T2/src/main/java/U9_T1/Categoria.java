package U9_T1;

public class Categoria {

    private String productline;

    public Categoria(String productline) {
        this.productline = productline;
    }

    public String getProductline() {
        return productline;
    }

    public void setProductline(String productline) {
        this.productline = productline;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "productline='" + productline + '\'' +
                '}';
    }
}
