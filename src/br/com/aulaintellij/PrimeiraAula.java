package br.com.aulaintellij;

import br.com.model.Gato;

import java.util.Scanner;

public class PrimeiraAula {

    public static void main(String[] args) {

        /* int a = 5, b = 3;
        System.out.println("Hello Word! " +(a+b));*/

        Scanner leitor = new Scanner(System.in);

        String nome, cor, idade;

        System.out.println(" Informe o nome do gato: ");

        nome = leitor.next();

        System.out.println(" Informe a cor do gato: ");

        cor = leitor.next();

        System.out.println(" Informe agora a idade do gato: ");

        idade = leitor.next();

        System.out.println("O nome do seu gato " + nome + " tem as cor(es) " + cor + " e a idade de " + idade + " ano(s).");


        Gato gato = new Gato();

        System.out.println(gato);


    }
}
