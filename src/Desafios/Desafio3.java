package Desafios;

import java.util.HashMap;

public class Desafio3 {
    public static void main(String[] args) {

        //Criar uma lista de produtos com preço

        HashMap<String, Double> listaDeCompras = new HashMap<>();
        listaDeCompras.put("Arroz", 10.90);
        listaDeCompras.put("Carne", 39.90);
        listaDeCompras.put("Leite", 3.99);

        for (String produto : listaDeCompras.keySet()){
            double preco = listaDeCompras.get(produto);

            System.out.println(produto + " está custando: " + preco);
        }
    }
}
