import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {

        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 10.5);
        notasAlunos.put("Matheus", 7.5);
        notasAlunos.put("Maria", 4.6);

        for (String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " tem a nota: " + nota);
            System.out.println("Primeiro nome: " + notasAlunos.firstKey());
            System.out.println("Último nome: " + notasAlunos.lastKey());
        }
    }
}
