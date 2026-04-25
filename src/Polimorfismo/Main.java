package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        int sabaoPo = 2;
        int mamao = 5;
        double sabonete = 2.90;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata, cenoura);

        System.out.println(total);
        System.out.println(totalDouble);
        System.out.println(totalInteger);

        Carro fusca = new Carro();
        fusca.mover();
    }
}
