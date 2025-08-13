import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] x= new int[3];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for ( int i = 0; i < x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
            if (x[i] > maior){
                maior = x[i];
            }
            if (x[i] < menor){
                menor = x[i];
            }
        }
        System.out.println("Maior --> " + maior + "\n" +"menor --> " + menor);
    }
}
