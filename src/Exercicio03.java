import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] media = new double[10];
        int numAlunos = 0;

        for (int i = 0; i < media.length; i++) {
            double total = 0;

            System.out.print("Digite as 4 notas do " + (i+1) + "º" + " aluno \n");

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j+1) + "º" +  " nota --> ");
                total += sc.nextDouble();
            }

                media[i] = total / 4.0;

                if (media[i] >= 6) {
                    numAlunos++;
                }

        }
        System.out.println("Numeros de alunos com média maior ou igual a 6,0 -->  " + numAlunos);
        sc.close();
    }
}
