package Associacao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Carro fusca = new Carro(10);
        fusca.mostrarCilidradas();

        Funcionarios amelia = new Funcionarios("Amelia");
        Funcionarios joana = new Funcionarios("Joana");
        Funcionarios joao = new Funcionarios("Joao");

        List<Funcionarios> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(amelia);
        listaFuncionarios.add(joana);
        listaFuncionarios.add(joao);

        Departamento ti = new Departamento("TI", listaFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
