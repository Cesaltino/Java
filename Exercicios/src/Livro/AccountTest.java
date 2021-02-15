package Livro;

import  java.util.Scanner;

//Cria e manipula um objeto Account
public class AccountTest {

    public static void main(String[] args){

        //cria um objeto Scanner para obter entrada a partir da janela de comando
        //Scanner input = new Scanner(System.in);

        //cria um objeto Account e o atribui a myAccount
        //Account myAccount = new Account();

        //System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //solicita e lê o nome
        //System.out.println("Please enter the name: ");
        //String  theName = input.nextLine(); //lê uma linha de texto
        //myAccount.setName(theName); //insere theName em myAccount
        //System.out.println();// gera saida de uma linha em branco

        //exibe o nome armazenado no objeto myAccount
        //System.out.printf("Name in object myAccout is: %n%s%n", myAccount.getName());



         //cria dois objetos Account
        Account account1 = new Account("Enzo Gabriel Rodrigues Lopes", 50.00);
        Account account2 = new Account("Cesaltino Rodrigues Lopes", -7.53);

        //exibe o saldo inicial de cad objeto Account
        System.out.printf(" %s balance: $%.2f %n", account1.getName(),
                account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", account2.getName(),
                account2.getBalance());

        //cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); //obtem a entrada do usuario
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount); //adiciona o saldo de account1

        //exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
                account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
         depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit((depositAmount));

         // exibe os saldos
        System.out.printf("%s balance: $ %.2f %n",
                account1.getName(), account1.getBalance() );
        System.out.printf("%s balance: $ %.2f %n%n",
                account2.getName(), account2.getBalance() );
    }
}
