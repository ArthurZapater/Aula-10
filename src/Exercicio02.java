import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] x= new int[10];
        int par = 0, impar = 0;

        for ( int i = 0; i < x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
            if (x[i] % 2 == 0){
                par++;
            }
            else impar++;
        }
        System.out.println("Numeros pares --> " + par + "\n" + "Numeros ímpares --> " + impar);

        sc.close();
    }
}
