package exercicios;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class Exercicio2Test {
    @Test
    public void findValue2Position4() throws Exception {
        Assertions.assertEquals(4, Exercicio2.findFibonacciPosition(2));
    }

    @Test
    public void valueNotInFibonacciSequence () {
        Assertions.assertThrows(Exception.class, () -> Exercicio2.findFibonacciPosition(4));
    }

    @Test
    public void findValue89Position12() throws Exception {
        Assertions.assertEquals(12, Exercicio2.findFibonacciPosition(89));
    }

}