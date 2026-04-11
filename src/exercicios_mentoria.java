import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicios_mentoria {
    public static void main(String[] args) {

//    1.1 Área do Quadrado - v1
//    Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
//    A fórmula para calcular a área de um quadrado é A = L2, onde L é a medida do lado do quadrado.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.printf("A área do quadrado é: %.2f\n", area);

//     1.2 Volume da Esfera
//     Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite aqui o diâmetro da esfera: ");
        double diamentro = scanner1.nextDouble();
        double raio = diamentro / 2;
        double resultado = (4.0 / 3) * Math.PI * Math.pow(raio, 3);
        System.out.printf("O volume da esfera é: %.2f", resultado);

//    1.3 Média Aritmética
//    Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.

        System.out.println("Digite 4 números para saber a média deles:");
        Scanner scanner2 = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>(4);

        for (int i = 0; i < 4 ; i++) {
        int numerosUser = scanner2.nextInt();
        numeros.add(numerosUser);
        }

        double soma = 0;
        for (double numero : numeros) soma += numero;
        System.out.println(soma / numeros.size());

        scanner.close();
    }

}
