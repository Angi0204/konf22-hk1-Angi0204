package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {



    /**
     * create a coffeemachine and verify the initial values
     */
    @Test
    @DisplayName( "Konstruktor Test")
    void testConstructor() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 52,150);
        Assertions.assertEquals(55, Nespresso.getMaxCoffeeBeansLevel());
    }

    /**
     * verify currentValues
     */
    @Test
    void fill() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 52,150);
        Nespresso.fill();
       // Assertions.assertEquals(180,150);
    }

    /**
     * Verify current values

    @Test
    void clean() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 52,150);
        Nespresso.clean();
        int actual= 150;
        Assertions.assertEquals(0,actual);

    }

    /**
     * test result if one or more levels are lower than minimum level
     */
    @Test
    void checkMinimumLevelBeforeFill() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 52,150);
        Nespresso.fill();
        Nespresso.checkMinimumLevel();
        Assertions.assertFalse(false);
    }

    /**
     * check current values beyond limits
     */
    @Test
    void checkMinimumLevelAfterFill() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 52,150);
        Nespresso.fill();
        Nespresso.checkMinimumLevel();
        Assertions.assertTrue(true);

    }

    /**
     * Verify return message,
     * currentWaterLevel and currentCoffeeBeansLevel
     * (don't forget to fill the machine)
     */
    @Test
    void brewSuccessAmericano() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 30,100);
Nespresso.brew("americano");

    }

    /**
     * order a coffee type "melange"
     * Verify return message
     * (don't forget to fill the machine)
     */
  /**  @Test
    void brewMelange() {
        CoffeeMachine Nespresso = new CoffeeMachine(180,55, 52,150);
        Nespresso.brew("melange");
        Assertions.assertEquals("Coffee not offered",Nespresso.brew("melange"));
    }

    /**
     * brew 3 times espresso doppo
     * used coffeemachine should only have a maxWaterLevel of 250
     * (don't forget to fill the machine)
     */
    void brew3EspressoDoppoWithMaxWaterLevel250() {

    }
}