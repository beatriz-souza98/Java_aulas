package EtapaConstrucao;

public class PlantaCasa implements Construcao{

    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    @Override
    public void construir(){
        System.out.println("Metragem " + metragem);
        System.out.println("Numeros de Quartos " + numeroQuartos);
        System.out.println("Numeros de " + numeroBanheiros);
        System.out.println("Material " + material);
    }

    @Override
    public void pintar(String cor) {
        System.out.println("Pintando a casa com a cor " + cor);
    }

    @Override
    public int calcularmetragem(int custoMetro) {
        return metragem + custoMetro;
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
