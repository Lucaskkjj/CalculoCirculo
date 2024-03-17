import java.util.Scanner;

public class Circulo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        int perimetro = 2;
        int área = 1;
        int raio = 3;


        System.out.println("\n Olá. \n Seja bem-vindo a calculadora NP.");
        System.out.println("\n -Se deseja calcular a área de um círculo, digite 1. \n -Se deseja calcular o perímetro de um círculo, digite 2.");
        int Acao = scan.nextInt();
        scan.nextLine();

        if(Acao==1){
            System.out.println("Digite o valor do raio para calcular a área:");
            long RaioCirculo = scan.nextLong();
            double ResultadoArea = 3.14 * Math.pow(RaioCirculo,2);
            System.out.println("A área do círculo é:"+ResultadoArea);

        }

        if(Acao == 2){
            System.out.println("Digite o valor do raio para calcular o perímetro:");
            long CirculoRaio = scan.nextLong();
            double ResultadoPerimetro = 2*3.14*CirculoRaio;
            System.out.println("O perímetro do círculo é:"+ResultadoPerimetro);


        }









    }








}

