package CalculadoraDeNotas;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {

InformacoesAlunos informacoesUser = new InformacoesAlunos();
Scanner info = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) a sua calculadora de média escolar da Escola Bia Student");

        System.out.println("Digite seu nome: ");
        informacoesUser.nomeAluno = info.nextLine();

        System.out.println("Digite sua turma: ");
        informacoesUser.turma = info.nextLine();

        System.out.println("Digite o semestre atual: ");
        informacoesUser.semestre = info.nextLine();

        System.out.println("Agora digite sua nota da primeira avaliação: ");
        informacoesUser.nota1 = info.nextDouble();

        System.out.println("Digite sua nota da segunda avaliação: ");
        informacoesUser.nota2 = info.nextDouble();

        System.out.println("Digite sua nota da terceira avaliação: ");
        informacoesUser.nota3 = info.nextDouble();

        informacoesUser.informacoes();
        informacoesUser.media();
        System.out.printf("Sua média final é: %.2f%n", informacoesUser.media());
        informacoesUser.aprovacao();

info.close();
    }
}

