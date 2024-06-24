package exercicios;

public class Exercicio2 {
    public static int findFibonacciPosition(int number) throws Exception {
        if (number == 0) return 1;
        if (number == 1) return 2;

        int previous = 0;
        int current = 1;

        int position = 2;
        int aux;
        while (number > current) {
            aux = current;
            current = previous + current;
            previous = aux;
            position++;
            if (number == current) return position;
        }

        throw new Exception("The number " + number + " is not a Fibonacci number");

    }
}
