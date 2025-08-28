import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[250];
        int temp;

        //Preenchimento e impressão antes da ordenação
        System.out.println("Antes da ordenação");

        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(5, 400);
            System.out.print(x[i] + " ");
        }

        // Lógica para ordenar (crescente)

        System.out.println("\nDepois da ordenação");

        for (int i = 0; i < x.length; i++) {
            for (int k = 0; k < x.length - 1; k++) {
                if (x[k] > x[k + 1]) {
                    temp = x[k];
                    x[k] = x[k + 1];
                    x[k + 1] = temp;
                }
            }
        }

        for (int j : x) {
            System.out.print(j + " ");
        }
    }
}
