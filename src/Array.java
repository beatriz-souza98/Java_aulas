public class Array {

    public static void main(String[] args) {

        int[] numeros = {20, 50, 30};
        String[] frutas;
        frutas= new String[]{"pera", "abacaxi", "jaboticaba", "acerola", "pinha"};

        double[] salarios= new double[5];
        salarios[0] = 1200.00;
        salarios[1] = 1300.00;
        salarios[2] = 1400.00;
        salarios[3] = 1600.00;
        salarios[4] = 1500.00;

        //interação sobre Array
//        for (int posicao = 0; posicao < salarios.length; posicao++) {
//            System.out.println("O salário do funcionário numero " + posicao + " é " + salarios[posicao]);
//        }

        for (double salario : salarios){
            System.out.println(salario);
        }

        salarios[2]= 2230.50;
        System.out.println(salarios[2]);
    }
}
