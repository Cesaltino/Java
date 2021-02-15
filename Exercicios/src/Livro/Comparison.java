package Livro;

import java.util.Scanner;

public class Comparison {

    //método main inicia a execução do aplicativo java
    public static void main(String[] args){

        //Cria Scanner para obter entrada a partir da linha de comando
        Scanner input =  new Scanner(System.in);
        int number1;
        int number2 ;

        System.out.print("Enter first interger: ");
        number1 = input.nextInt(); // lê o primeiro numero fornecido pelo usuario

        System.out.print("Enter second interger: "); //lê o seundo numero fornecido pelo usuario
        number2 = input.nextInt();
        if(number1 == number2)
            System.out.printf("%d == %d%n",number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if ( number1 < number2)
        System.out.printf("%d < %d%n",number1, number2);

        if(number1 > number2)
        System.out.printf("%d > %d%n", number1,number2);

        if (number1 <= number2)
        System.out.printf("%d <= %d%n", number1, number2);

        if (number1 >= number2)
        System.out.printf("%d >= %d%n",number1, number2);

}
}