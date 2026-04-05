import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner diaUser = new Scanner(System.in);

        System.out.println("Digite um número correspondente ao dia da semana (1 ao 7)");
        int diasDaSemana = diaUser.nextInt();
        diaUser.close();

    switch (diasDaSemana){
        case 1:
            System.out.println("Hoje é Domingo");
            break;
        case 2:
            System.out.println("Hoje é Segunda");
            break;
        case 3:
            System.out.println("Hoje é Terça");
            break;
        case 4:
            System.out.println("Hoje é Quarta");
            break;
        case 5:
            System.out.println("Hoje é Quinta");
            break;
        case 6:
            System.out.println("Hoje é Sexta");
            break;
        case 7:
            System.out.println("Hoje é Sábado");
            break;
    }
    }
}
