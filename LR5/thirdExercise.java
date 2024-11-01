package LR5;
import java.util.regex.*;
public class thirdExercise {
    public static void main(String[] args) {
        String text = "rArrrArRarA";
        try {
            Pattern pattern = Pattern.compile("([a-z])([A-Z])");
            Matcher matcher = pattern.matcher(text);
            StringBuilder result = new StringBuilder();
            int lastIndex = 0;
            if (text == "") {
                throw new IllegalArgumentException("Empty text");
            }
            while (matcher.find()) {
                result.append(text, lastIndex, matcher.start());
                result.append("!").append(matcher.group(1)).append(matcher.group(2)).append("!");
                lastIndex = matcher.end();
            }
            result.append(text.substring(lastIndex));
            System.out.println(result.toString());
        } catch (PatternSyntaxException e) {
            System.out.println("Error in regular expression syntax: " + e.getDescription());
        } catch (IllegalArgumentException e) {
            System.err.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
