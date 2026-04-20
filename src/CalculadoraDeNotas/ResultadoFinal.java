package CalculadoraDeNotas;

public class ResultadoFinal {
    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String aprovacao(double media) {
        if (media >= 7) {
            return "Você foi aprovado(a), parabéns!";
        }
        else if (media >= 5) {
            return "Você está de recuperação!";
        }
        else {
            return "Você foi reprovado(a)!";
        }
    }
    }
