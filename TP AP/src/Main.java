import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Ronda ronda1 =  new Ronda();
        FileReader lecturaRes = new FileReader("C:\\Users\\crist\\OneDrive\\Documentos\\AP Java 2023\\TP AP FINAL JAVA\\TP AP\\resultados.csv");
        BufferedReader br = new BufferedReader(lecturaRes);

//lee la linea del archivo,csv
        String linea = "";
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);


        }


    }

}