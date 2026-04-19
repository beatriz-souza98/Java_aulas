public class PlantaCasa {

    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir(){
        System.out.println("Metragem " + metragem);
        System.out.println("Numeros de Quartos " + numeroQuartos);
        System.out.println("Numeros de " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    public int somarmetragem(){
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void pintar(){
        System.out.println("Cor da casa  " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;
        pintar();
    }
}
