package Heranca;

public class Principal {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha getrudes = new Galinha();
        getrudes.ciscar();
        getrudes.comer("Milho");
        getrudes.beberAgua();
        getrudes.dormir();
    }
}
