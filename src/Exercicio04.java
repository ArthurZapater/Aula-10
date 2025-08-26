import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
        double[] temperatura = new double[mes.length];
        double mediaAnual = 0;

        for ( int i = 0; i < mes.length; i++){

            System.out.print("Digite a temperatura de " + mes[i] + " --> ");
            temperatura[i] = sc.nextDouble();
            mediaAnual += temperatura[i];
        }

        mediaAnual /= mes.length;

        System.out.println("\nMédia anual: " + df.format(mediaAnual));

        System.out.println("\nMeses em que a temperatura foi maior que a média:");

        for (int i = 0; i < temperatura.length; i++){
            if (temperatura[i] > mediaAnual){
                System.out.println(df.format(temperatura[i]) + " - " + mes[i]);
            }
        }










    }
}
