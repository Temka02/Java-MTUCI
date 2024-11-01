package LR5;
import java.util.regex.*;

public class fourthExercise {
    public static void main(String[] args) {
        try{
            //String ip = "192.168.1.1";
            String ip = "";
            Pattern ipPattern = Pattern.compile("^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$");
            Matcher matcher = ipPattern.matcher(ip);
            if (ip == "") {
                throw new IllegalArgumentException("Empty IP");
            }
            if (matcher.matches()) {
                System.out.println("IP address is correct");
            } else {
                System.out.println("Incorrect IP address");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Error in regular expression syntax: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }      
    }
}
