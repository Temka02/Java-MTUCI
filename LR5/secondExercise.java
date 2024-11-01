package LR5;
import java.util.regex.*;

public class secondExercise {
    public static void main(String[] args) {
        String password = "Albert5emenovi4";
        //String password = "";
        try {
            String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
            Pattern pattern = Pattern.compile(passwordPattern);
            Matcher matcher = pattern.matcher(password);
            if (password == "") {
                throw new IllegalArgumentException("Empty password");
            }
            if (matcher.matches()) {
                System.out.println("Password is correct");
            } else {
                System.out.println("The password does not meet the requirements");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Error in regular expression syntax: " + e.getDescription());
        } catch (IllegalArgumentException e) {
            System.err.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } 
    }
}

