package de.neueFische;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppMainTest {

    @Test
    public void testAddition(){
        int additionResult = AppMain.addition(10,5);
        assertEquals(additionResult, 15);
    }

    @Test
    public void testIsBiggerThan100(){
        boolean isBiggerthan100Result = AppMain.testIfBiggerthan100(112);
        assertEquals(isBiggerthan100Result, true);
    }

    @Test
    public void testModuloOfNumbersIsZero(){
        boolean moduloOfNumbersIsZero = AppMain.moduloOfNumbersIsZero(30, 15);
        assertEquals(moduloOfNumbersIsZero, true);
    }
}