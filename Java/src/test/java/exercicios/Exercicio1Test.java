package exercicios;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;

public class Exercicio1Test {

    @Test
    public void zeroValueShouldReturnOne() {
        Assertions.assertEquals(0, Exercicio1.fatorial(0L));
    }

    @Test
    public void oneShouldReturnOne() {
        Assertions.assertEquals(1, Exercicio1.fatorial(1L));
    }

    @Test
    public void multipleTests() {
        Assertions.assertEquals(2, Exercicio1.fatorial(2L));
        Assertions.assertEquals(6, Exercicio1.fatorial(3L));
        Assertions.assertEquals(120, Exercicio1.fatorial(5L));
        Assertions.assertEquals(120, Exercicio1.fatorial(5L));
    }
}