package Commercial_Establishment_Menu;

public class ChildMenu extends Menu {
//    Attributes
    private double suprisePrice;

//    Constructor
    public ChildMenu(double basePrice, double suprisePrice) {
        super(basePrice);
        this.suprisePrice = suprisePrice;
    }

//  Getters/Setters
    public double getSuprisePrice() {
        return suprisePrice;
    }

    public void setSuprisePrice(double suprisePrice) {
        this.suprisePrice = suprisePrice;
    }

    //    Methods
    @Override
    public void assembleMenu() {
        System.out.println("Assemble kids menu, with suprise gift");
    }

    @Override
    public double calculatePrice() {
        double value = getBasePrice() + getSuprisePrice();
        System.out.printf("The kids menu costs R$" + "%.2f", value);
        System.out.println();
        return value;
    }
}
