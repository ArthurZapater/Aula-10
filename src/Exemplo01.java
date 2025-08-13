import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] x = new int[5];

        // armazenamento dos números

        for ( int i = 0; i < x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
        }

        // impressão dos valores
        //for (int i = 0; i < x.length; i++) System.out.print(x[i] + " ");

        // impressão invertido
        for (int i = x.length -1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }
}
