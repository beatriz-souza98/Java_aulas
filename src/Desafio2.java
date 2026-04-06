import java.util.ArrayList;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        //Crie uma lista de nomes e mostre:
        //Todos os nomes
        //Quantos nomes tem na lista

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("Tamanho da ArrayList é: " + nomes.size());
    }
}
