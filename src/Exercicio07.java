import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[rd.nextInt(1, 15)];
        int frequencia, grau =0 ;


        for (int i = 0; i < x.length; i++){

            x[i] = rd.nextInt(1,20);
            System.out.println((i+1) + "º" + " número --> " + x[i]);
        }

        for (int j : x) {
            frequencia = 0;
            for (int i : x) {
                if (j == i) {
                    frequencia++;
                }
            }

            if (frequencia > grau) {
                grau = frequencia;
            }

        }



        System.out.println("O Grau deste vetor é " + grau);
    }
}
