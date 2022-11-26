import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("**** Bem Vindo ao programa de Cálculo de Média ****");

        System.out.print("Digite o nome do aluno: ");
        nome = scan.next().toUpperCase();

        System.out.println("Aluno(a): " + nome);

        System.out.print("Digite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.print("Digite a teceira nota: ");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if (media >= 6){
            System.out.print( "Aluno(a) " + nome + " APROVADO com a média: " + media);
        }else {
            System.out.print( "Aluno(a) " + nome + " REPROVADO com a média: " + media);
        }
    }
}