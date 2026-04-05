public class Casting {

    public static void main(String[] args) {

        int numero = 5;
        double d = numero;

        double d2 = 10.50;
        int int2 = (int) d2;

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString();

        Long numeroLong = 20L;
        String numeroStringLong = numeroLong.toString();

        String numString = "20";
        Integer numInteger = Integer.parseInt(numString);
        Double numDouble = Double.parseDouble(numString);
        Long numLong = Long.parseLong(numString);

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroString);
        System.out.println(numeroInteger);
        System.out.println(numDouble);
        System.out.println(numLong);
        System.out.println(numeroStringLong);
    }
}
