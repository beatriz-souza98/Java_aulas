import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Matheus", 7.5);
        notasAlunos.put("Maria", 4.6);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " tem a nota: " + nota);
        }

        double nota = notasAlunos.get("Alice");
        System.out.println("A nota da Alice é: " + nota);

        for (Map.Entry<String, Double> nota2 : notasAlunos.entrySet()) {
        String nome = nota2.getKey();
        double valorDanota = nota2.getValue();
            System.out.println(nome + " " + valorDanota);
        }
        int tamanhoHash = notasAlunos.size();
        System.out.println(tamanhoHash);
        }
}
