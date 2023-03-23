import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String csvFile = "C:\\Users\\crist\\OneDrive\\Documentos\\AP Java 2023\\TP AP FINAL JAVA\\TP AP\\pronostico.csv";
        String line = "";
        String csvDelimiter = ";";


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String recuperarX = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvDelimiter);
                System.out.println(data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4]);
                if (data[1].contains("X")) {
                    recuperarX = "gana1";
                } else if (data[2].contains("X")) {
                    recuperarX = "empata";
                } else if (data[3].contains("X")) {
                    recuperarX = "gana2";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}