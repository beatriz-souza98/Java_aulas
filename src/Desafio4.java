import java.util.Map;
import java.util.TreeMap;

public class Desafio4 {

    public static void main(String[] args) {

        // Criar um ranking de alunos com notas

        TreeMap<String, Integer> rankingNotas = new TreeMap<>();
        rankingNotas.put("Adriel", 10);
        rankingNotas.put("Vera", 7);
        rankingNotas.put("Beatriz", 9);

        for (String nome : rankingNotas.keySet()){
            Integer nota = rankingNotas.get(nome);
            System.out.println("Nome: " + nome + " Nota: " + nota);
        }

        System.out.println("-----------------------------------------------------------");

        for (Map.Entry<String,Integer> item : rankingNotas.entrySet()){
            System.out.println("Nome: " + item.getKey() + " Nota: " + item.getValue());
        }
    }
}