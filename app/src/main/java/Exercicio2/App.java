package Exercicio2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //faça um algoritimo que receba numeros inteiros e mostre positivo negativo ou 0
        Scanner leitor = new Scanner(System.in);
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um numero");
            int numero = leitor.nextInt();
            if (numero == 0) {
                System.out.println("O numero é 0");
            } else if (numero > 0) {
                System.out.println("O numero é maior que 0");
            } else {
                System.out.println("O numero é menor que 0");
            }
            System.out.println("Deseja continuar? Sim ou Não?");
            desejaContinuar = leitor.next().charAt(0);

        }
    }
}
