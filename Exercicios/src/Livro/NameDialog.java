package Livro;
//Obetendo a entrada do usuario apartir de um dialogo

import  javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args){

        //pede o nome do usuario
        String name = JOptionPane.showInputDialog("What is your name?");

        //cria a mensagem
        String message =
                String.format("Welcome, %s to Java Programming! ", name);

        //exibe a mensagem para cumprimentar o usuario pelo nome
        JOptionPane.showMessageDialog(null,message);
    }


}
