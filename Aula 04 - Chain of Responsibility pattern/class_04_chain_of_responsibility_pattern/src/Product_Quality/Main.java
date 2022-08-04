package Product_Quality;

public class Main {
    public static void main(String[] args) {
        CheckQuality checkQuality = new CheckQuality();
        checkQuality.verificar(new Product("Product 1", 1300, 1200, "saudável"));
        checkQuality.verificar(new Product("Product 2", 900, 1200, "quase saudável"));
        checkQuality.verificar(new Product("Product 3", 1234, 1437, "saudável"));
        checkQuality.verificar(new Product("Product 4", 1250, 1200, "não saudável"));
    }
}
