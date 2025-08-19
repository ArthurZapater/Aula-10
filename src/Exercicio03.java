import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double[] media = new double[3];
        int numAlunos = 0;

        for (int i = 0; i < media.length; i++) {
            double notas = 0;

            System.out.print("Digite as 4 notas do " + (i+1) + "º" + " aluno \n");

            for (int j = 1; j <= 4; j++) {
                System.out.print("Digite a " + (j) + "º" +  " nota --> ");
                notas += sc.nextDouble();
            }

                media[i] = notas / 4.0;

                if (media[i] >= 6) {
                    numAlunos++;
                }

                System.out.println("==========");
        }

        System.out.println("\nMédia dos alunos ");
        for (int i = 0; i < media.length; i++){
            System.out.println( (i+1) + " " + df.format(media[i]));
        }

        System.out.println("Numeros de alunos com média maior ou igual a 6,0 -->  " + numAlunos);
        sc.close();
    }
}
