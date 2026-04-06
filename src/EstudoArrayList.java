import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Uva");
        listaDeCompras.add("Abacate");
        listaDeCompras.add("Morango");
        listaDeCompras.add(1,"Banana");

        for (String item : listaDeCompras){
            System.out.println(item);
        }
        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho o item: " + item);

        listaDeCompras.remove("Uva");

        for (String item2 : listaDeCompras){
            System.out.println(item2);
    }
        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Morango");

        System.out.println("A lista está vazia? " + eVazia);
        System.out.println("Qual o tamanho da lista? " + tamanho);
        System.out.println("Na lista contém o Morango? " + contem);

//        listaDeCompras.clear();
//        System.out.println("A lista está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));
}}
