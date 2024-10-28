package LR4;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ExceptionLogger {
    public static void logException(Exception e) {
        try (FileWriter writer = new FileWriter("C://Users//Артём//Java//LR4//error_log.txt", true)) {
            writer.write("Timestamp: " + LocalDateTime.now() + "\n");
            writer.write("Exception: " + e.getClass().getSimpleName() + "\n");
            writer.write("Message: " + e.getMessage() + "\n");
            writer.write("-------------------------------\n");
        } catch (IOException ioException) {
            System.out.println("Ошибка записи в лог-файл: " + ioException.getMessage());
        }
    }
}
