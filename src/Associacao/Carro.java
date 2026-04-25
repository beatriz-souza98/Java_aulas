package Associacao;

public class Carro {

    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro(int cilidradas){
        this.motor = new Motor(cilidradas);
    }

    public void mostrarCilidradas(){
        System.out.println("Carro com motor de " + motor.getCilidradas() + " cilindradas");
    }
}
