public class EstruturaIFElse {

    public static void main(String[] args) {

//        int idade = 30;
//
//        if (idade > 20){
//            System.out.println("Você é maior de idade");
//        }
//        else{
//            System.out.println("Você é menor de idade");
//        }
//        }
//
//        boolean estaChovendo = true;
//
//        if (!estaChovendo){
//            System.out.println("Vamos sair para passear");
//        }
//        else {
//            System.out.println("Vamos ficar em casa");
//        }
//
        boolean tempix = false;
        boolean temcartao = false;

        if (tempix && temcartao){
            System.out.println("Pode pedir almoço e uma sobremesa");
        } else if (tempix || temcartao) {
            System.out.println(" Compre só o ifood");
        }
        else {
            System.out.println("Compre nada, tu é lisa");
        }

        String mensagem = (tempix) ? "Pedi um almoço" : "Come o que tem em casa";
        System.out.println(mensagem);
    }
    }

