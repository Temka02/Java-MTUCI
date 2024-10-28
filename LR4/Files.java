package LR4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        String sourcePath = "H://test.txt";
        String destinationPath = "H://destination.txt";

        try (FileInputStream inputFile = new FileInputStream(sourcePath);
             FileOutputStream outputFile = new FileOutputStream(destinationPath)) {
             
            int byteData;
            while ((byteData = inputFile.read()) != -1) {
                outputFile.write(byteData);
            }
            System.out.println("The file was successfully copied!");

        } catch (IOException e) {

            System.out.println("Error when working with files: " + e.getMessage());
        }
    }
}
