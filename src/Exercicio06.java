import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int qtd;
        boolean especial = true;

        System.out.print("Digite a qtd de elementos --> ");
        qtd = sc.nextInt();

        int[] x = new int[qtd];

        //ENTRADA DE DADOS
        for (int i = 0; i < x.length; i++){
            System.out.print("Digite o " + (i+1) + "º" + " elemento --> ");
            x[i] = sc.nextInt();
        }

        //VERIFICA SE O VETOR NÃO É ESPECIAL
        for (int i = 0; i < x.length - 1; i++){
            if ( x[i] % 2 == x[i+1] % 2){
                especial = false;
                break;
            }
        }

        if (especial){
            System.out.println("É");
        }
        else {
            System.out.println("Não");
        }
    }
}
