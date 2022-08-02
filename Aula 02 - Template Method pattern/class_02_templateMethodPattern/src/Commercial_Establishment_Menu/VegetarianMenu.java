package Commercial_Establishment_Menu;

public class VegetarianMenu extends Menu {
//    Attributes
    private double packagingCost;

//    Constructor
    public VegetarianMenu(double basePrice, double packagingCost) {
        super(basePrice);
        this.packagingCost = packagingCost;
    }

//    Getters/Setters
    public double getPackagingCost() {
        return packagingCost;
    }

    public void setPackagingCost(double packagingCost) {
        this.packagingCost = packagingCost;
    }

    //    Methods
    @Override
    public void assembleMenu() {
        System.out.println("Assemble vegetarian menu, with seasonings and special packaging");
    }

    @Override
    public double calculatePrice() {
        double price = (getBasePrice() * 1.01) + getPackagingCost();
        System.out.printf("The vegetarian menu costs R$" + "%.2f", price);
        System.out.println();
        return price;
    }

}
