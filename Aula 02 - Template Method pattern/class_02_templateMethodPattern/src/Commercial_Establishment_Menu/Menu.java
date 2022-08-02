package Commercial_Establishment_Menu;

public abstract class Menu {
//    Attributes
    private double basePrice;

//    Constructor
    public Menu(double basePrice) {
        this.basePrice = basePrice;
    }

//    Getters/Setters
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

//    Methods
    public void prepareMenu(){
        assembleMenu();
        calculatePrice();
    }

    public abstract void assembleMenu();

    public abstract double calculatePrice();

}
