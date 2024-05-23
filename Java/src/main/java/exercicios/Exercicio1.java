package exercicios;

/** Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.*/
public class Exercicio1 {
    public static Long fatorial(Long n) {
        if (n == 0) return 1L;

        Long resultado = 1L;
        for (Long i=n; i > 0; i--) {
            resultado *= i;
        }
        return resultado;
    }
}
