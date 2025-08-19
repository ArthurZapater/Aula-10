import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd, aux, j;

        System.out.print("Qual a quantidade de números? --> ");
        qtd = sc.nextInt();

        int[] x = new int[qtd];

        //Entrada de dados
        for (int i = 0; i < x.length; i++){

            System.out.print("Informe os números --> ");
            x[i] = sc.nextInt();

        }

        System.out.println();

        //Array original
        for (int i : x) {
            System.out.print(i + " ");
        }

        //Array invertido
        j = x.length - 1;
        for (int i = 0; i < x.length / 2; i++){
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
            j--;
        }

        System.out.println();

        for (int i : x) {
            System.out.print(i + " ");
        }





    }
}
