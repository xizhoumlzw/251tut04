package tut4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void testadd(){
        Assertions.assertEquals(2, Calc.add(1,1));
    }
    @Test
    public void testsub() { Assertions.assertEquals(1, Calc.substract(2,1));}
    }