package exemploExcecoes;

public class ExemploBasico {

    public static void metodo(){
        try {
            new java.io.FileInputStream("arquivo.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Não foi possível abrir o arquivo para leitura");
        }


    }
}

