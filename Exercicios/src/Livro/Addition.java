package Livro;

import java.util.Scanner;

public class Addition {

    //metodo main inicia a execução do aplicativo Java
    public static void main(String[] args){

        //Cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        int number1; //primeiro numero a somar
        int number2; //segundo numero a somar
        int sum; //soma de number1 e number2

        System.out.print("Enter first interger: ");
        number1 = input.nextInt(); //lê o primeiro numero fornecido pelo usuario

        System.out.print("Enter second interger: ");
        number2 = input.nextInt(); //lê o segundo numero fornecido pelo usuario

        sum = number1 + number2; //soma os numeros, depois amarzena o total em sum

        System.out.printf("Sum is %d%n", sum); //exibe a soma
    }
}
