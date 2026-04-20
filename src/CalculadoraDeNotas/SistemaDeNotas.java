package CalculadoraDeNotas;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Seja bem vindo(a) a sua calculadora de média escolar da Escola Bia Student");
        int opcao;

        do {
            System.out.println("Escolha uma opção (Digite o numero correspondente):");
            System.out.println("1 - Calcular nota");
            System.out.println("2 - Sair");
            opcao = info.nextInt();

            if (opcao == 1) {
                InformacoesAlunos informacoesUser = new InformacoesAlunos();
                info.nextLine();
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

                ResultadoFinal resultado = new ResultadoFinal();
                double media = resultado.calcularMedia(
                        informacoesUser.nota1,
                        informacoesUser.nota2,
                        informacoesUser.nota3
                );
                informacoesUser.informacoes();
                System.out.printf("Sua média final é: %.2f%n", media);
                System.out.println(resultado.aprovacao(media));
            }
            else if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida! Digite uma opção valida.");
            }
        }
        while (opcao != 2) ;
        System.out.println("Programa encerrado.");
        info.close();

    }
}

