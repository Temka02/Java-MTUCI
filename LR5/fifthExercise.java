package LR5;
import java.util.regex.*;
public class fifthExercise {
    public static void main(String[] args) {
        String text = "Самым симпатичным щеночком оказался маленький серый бульдог";
        char myLetter = '1';
        try{
            if (!Character.isLetter(myLetter)) {
                throw new IllegalArgumentException("The given letter must be a symbol");
            }
            if (text == "") {
                throw new IllegalArgumentException("Empty text");
            }
            Pattern pattern = Pattern.compile("\\b[" + Character.toLowerCase(myLetter) + Character.toUpperCase(myLetter) + "][a-zA-Zа-яА-Я0-9]*");
            Matcher matcher = pattern.matcher(text);
            boolean flag = true;
            System.out.println("Words starting with letter: '" + myLetter + "':");
            while (matcher.find()) {
                System.out.println(matcher.group());
                flag = false;
            }
            if (flag){
                System.out.println("There were no words starting with the letter " + myLetter);
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Error in regular expression syntax: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }  
    }
}

