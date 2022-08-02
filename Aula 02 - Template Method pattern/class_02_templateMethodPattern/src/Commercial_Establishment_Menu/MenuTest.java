package Commercial_Establishment_Menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MenuTest {
//    Attributes
    AdultMenu adultMenu;
    ChildMenu kidsMenu;
    VegetarianMenu vegetarianMenu;

    @BeforeEach
    void doBefore(){
        adultMenu = new AdultMenu(15.32);
        kidsMenu = new ChildMenu(16.56, 7.21);
        vegetarianMenu = new VegetarianMenu(13.99,4.05);
    }

    @Test
    void priceCalculator() {
        Assertions.assertEquals(15.32, adultMenu.calculatePrice());
        Assertions.assertEquals(23.77, kidsMenu.calculatePrice());
        Assertions.assertEquals(18.18, vegetarianMenu.calculatePrice(), 0.01);
    }

    @Test
    void printMontage(){
        System.out.println();
        adultMenu.assembleMenu();
        kidsMenu.assembleMenu();
        vegetarianMenu.assembleMenu();
    }
}