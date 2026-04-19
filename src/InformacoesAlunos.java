public class InformacoesAlunos {

String nomeAluno;
String turma;
String semestre;
double nota1;
double nota2;
double nota3;

public void informacoes(){
    System.out.println("Segue suas informações abaixo");
    System.out.println("Nome: " + nomeAluno);
    System.out.println("Turma: " + turma);
    System.out.println("Semestre: " + semestre);
}

public double media(){
    return  (nota1 + nota2 + nota3) / 3;
}

public void aprovacao(){
    if (media() >= 7){
        System.out.println("Você foi aprovado(a), parabéns!");}
    else if (media() >= 5){
        System.out.println("Você está de recuperação!");}
    else{
        System.out.println("Você foi reprovado(a)!");
    }
}
}

