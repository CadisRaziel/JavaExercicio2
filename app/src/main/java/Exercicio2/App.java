package Exercicio2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //fa�a um algoritimo que receba numeros inteiros e mostre positivo negativo ou 0
        Scanner leitor = new Scanner(System.in);
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um numero");
            int numero = leitor.nextInt();
            if (numero == 0) {
                System.out.println("O numero � 0");
            } else if (numero > 0) {
                System.out.println("O numero � maior que 0");
            } else {
                System.out.println("O numero � menor que 0");
            }
            System.out.println("Deseja continuar? Sim ou N�o?");
            desejaContinuar = leitor.next().charAt(0);

        }
    }
}
