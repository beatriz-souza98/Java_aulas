package exececao.Verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\Marques Adriel\\Documents\\texto.txt"));
            String linha;

            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
        }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo" + e.getMessage());
            throw new RuntimeException(e);
        }

        }
    }
