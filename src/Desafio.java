public class Desafio {

    public static void main(String[] args) {

//        Crie um sistema que:
//
//        Tenha um array com 5 números
//        Use for para percorrer
//        Use if para separar pares e ímpares

        int[] numeros = {1, 2, 3, 4, 5};


        for (int contador = 0; contador < numeros.length; contador++) {
            if (numeros[contador] % 2 == 0){
                System.out.println("O número " + numeros[contador] + "  é par");
            }
            else {
                System.out.println("O número " + numeros[contador] + "  é impar");
            }
        }
    }
}
