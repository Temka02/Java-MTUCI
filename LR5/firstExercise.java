package LR5;
import java.util.regex.*;

public class firstExercise {
    public static void main(String[] args) {
        String text = "25 октября я пошел в магазин и купил там сливочное масло за 199.99 рублей и еще купил молоко за 62.49";
        // String text = "";
        try {
            if (text == "") {
                throw new IllegalArgumentException("Empty text");
            }
            Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);
            boolean flag = true;
            System.out.println("Found numbers:");
            while (matcher.find()) {
                System.out.println(matcher.group());
                flag = false;
            }
            if (flag){
                System.out.println("Numbers not found");
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