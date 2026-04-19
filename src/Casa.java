public class Casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();

        casa.numeroQuartos = 3;
        casa.numeroBanheiros = 2;
        casa.metragem = 70;
        casa.cor = "Cinza";
        casa.material = "Tijolo";

        casa.construir();
        casa.pintar();
        int resultado = casa.somarmetragem();
        System.out.println(resultado);

    }
}
