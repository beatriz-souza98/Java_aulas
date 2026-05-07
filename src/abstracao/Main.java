package abstracao;

public class Main {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das Flores", "56", "Araucaria", "Paraná", "567876", "Joao Pedro", "5458536", "Vendedor");
        Cliente joana = new Cliente("Rua das Flores", "567", "RJ", "5525225", "Joana Carla", "4528536");
        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
