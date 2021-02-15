package Livro;

//Classe Account que contem uma variavel de instancia name
// e metodos para configurar e obter seu valor.
public class Account {

    private String name; // variavel de instancia
    private double balance; // variavel de instancia.

    // Construtor de Account que recebe dois parametros
    public Account(String name, double balance) {
        this.name = name;

        //valida que o balance é maior que 0.0: se não for,
        // a variavel de instancia balance mantem seu valor inicial padrao de 0.0
        if (balance > 0.0) //se o saldo for valido
            this.balance = balance; //atribui a variavel de instancia balance

    }

    //metodo que deposita (adiciona) apenas uma quantia valida no saldo
    public void deposit(double depositAmount){
        if (depositAmount > 0.0) // se depositAmount for valido
            balance = balance + depositAmount; //o adciona ao saldo
    }

    //metodo que retorna o saldo da conta
    public double getBalance(){
        return balance;
    }


    //metodo para definir o nome no objeto
    public void setName(String name){

        this.name = name; //armazena o nome
    }

    //metodo para recuperar o nome do objeto
    public String getName(){

        return name; //retorna ov alor nome para o chamador
    }
}
