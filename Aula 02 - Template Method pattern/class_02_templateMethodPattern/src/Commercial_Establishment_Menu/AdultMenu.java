package Commercial_Establishment_Menu;

public class AdultMenu extends Menu {
//    Constructor
    public AdultMenu(double basePrice) {
        super(basePrice);
    }

    //    Methods
    @Override
    public void assembleMenu() {
        System.out.println("Assemble adults menu, without additional options");
    }

    @Override
    public double calculatePrice() {
        System.out.printf("The adult menu costs R$" + "%.2f", super.getBasePrice());
        System.out.println();
        return super.getBasePrice();
    }

}
