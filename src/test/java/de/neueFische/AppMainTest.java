package de.neueFische;
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
        boolean isBiggerThan100Result = AppMain.testIfBiggerthan100(112);
        assertTrue(isBiggerThan100Result);
    }

    @Test
    public void testModuloOfNumbersIsZero(){
        boolean moduloOfNumbersIsZero = AppMain.moduloOfNumbersIsZero(30, 15);
        assertTrue(moduloOfNumbersIsZero);
    }
}