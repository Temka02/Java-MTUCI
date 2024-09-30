import java.util.Arrays;
public class secondTask {
    public static void main(String[] args){
        // 1 задача
        System.out.println("------------------------------------1 point--------------------------------------");
        System.out.println(duplicateChars("Barack", "Obama"));

        // 2 задача
        System.out.println("------------------------------------2 point--------------------------------------");
        int[] arrayOfNumbers = {3, 12, 7, 81, 52};
        System.out.println(dividedByThree(arrayOfNumbers));

        // 3 задача
        System.out.println("------------------------------------3 point--------------------------------------");
        System.out.println(getInitials("simonov sergey evgenievich"));

        // 4 задача
        System.out.println("------------------------------------4 point--------------------------------------");
        double[] arrayFourPoint = {3.5, 7.0, 1.5, 9.0, 5.5};
        System.out.println(Arrays.toString(normalizator(arrayFourPoint)));

        
        // 5 задача
        System.out.println("------------------------------------5 point--------------------------------------");
        double[] arrayFivePoint = {1.6, 0, 212.3, 34.8, 0, 27.5};
        System.out.println(Arrays.toString(compressedNums(arrayFivePoint)));

        // 6 задача
        System.out.println("------------------------------------6 point--------------------------------------");
        System.out.println(camelToSnake("helloWorld"));

        // 7 задача
        System.out.println("------------------------------------7 point--------------------------------------");
        int[] arraySevenPoint = {3, 5, 8, 1, 2, 4};
        System.out.println(secondBiggest(arraySevenPoint)); 

        // 8 задача
        System.out.println("------------------------------------8 point--------------------------------------");
        String reverseEight = localReverse("Hello, I'm under the water, please help me", 'e');
        System.out.println(reverseEight);

        // 9 задача
        System.out.println("------------------------------------9 point--------------------------------------");
        System.out.println(equal(8, 1, 8));
        System.out.println(equal(5, 5, 5));
        System.out.println(equal(4, 9, 6));

        // 10 задача
        System.out.println("------------------------------------10 point--------------------------------------");
        System.out.println(isAnagram("LISTEN", "silent"));
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!"));
        System.out.println(isAnagram("hello", "world"));

    }
    // 1 задача
    public static String duplicateChars(String x, String y) {
        String result = "";
        String lowerX = x.toLowerCase();
        String lowerY = y.toLowerCase();
        for (int i = 0; i <= lowerX.length()-1; i++){
            if (lowerY.indexOf(lowerX.charAt(i)) == -1){
                result += lowerX.charAt(i);
            } 
        }
        return result;
    }

    // 2 задача
    public static int dividedByThree(int[] numbers) {
        int count = 0;
        for (int i = 0; i <= numbers.length - 1; i++){
            if (numbers[i] % 2 != 0){
                if (numbers[i] % 3 == 0){
                    count++;
                }
            }
        }
        return count;
    }
    
    // 3 задача
    public static String getInitials(String x) {
        String[] splitInitials = x.split(" ");
        String surname = splitInitials[0].toUpperCase().charAt(0) + splitInitials[0].substring(1);
        char firstLetterName = splitInitials[1].toUpperCase().charAt(0);
        char firstLetterPatronymic = splitInitials[2].toUpperCase().charAt(0);
        String initials = firstLetterName + "." + firstLetterPatronymic + "." + surname;
        return initials;
    }

    // 4 задача
    public static double[] normalizator(double[] numbersFour) {
        double maxNumber = numbersFour[0];
        double minNumber = numbersFour[0];
        double[] finalArrayFour = new double[numbersFour.length];
        for (int i = 0; i < numbersFour.length; i++){
            if (numbersFour[i] > maxNumber){
                maxNumber = numbersFour[i];
            }
            if (numbersFour[i] < minNumber) {
                minNumber = numbersFour[i];
            }
        }
        for (int j = 0; j < numbersFour.length; j++){
            finalArrayFour[j] = (numbersFour[j]-minNumber) / (maxNumber-minNumber);
        }
        return finalArrayFour;
    }
    
    // 5 задача
    public static int[] compressedNums(double[] numbersFive){
        int[] intArrayFiveZero = new int[numbersFive.length];
        int countZero = 0;
        for (int i = 0; i < numbersFive.length; i++){
            intArrayFiveZero[i] = (int) numbersFive[i];
        }
        for (int j = 0; j < intArrayFiveZero.length; j++){
            if (intArrayFiveZero[j] == 0) {
                countZero++;
            }
        }
        int[] intArrayFive = new int[intArrayFiveZero.length - countZero];
        int countInt = 0;
        for (int k = 0; k < intArrayFiveZero.length; k++){
            if (intArrayFiveZero[k] != 0) {
                intArrayFive[countInt] = intArrayFiveZero[k];
                countInt++;
            } 
        }
        Arrays.sort(intArrayFive);
        return intArrayFive;
    }
    
    // 6 задача
    public static String camelToSnake(String camelCase) {
        StringBuilder snakeCase = new StringBuilder();
        for (char letter : camelCase.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                snakeCase.append("_").append(Character.toLowerCase(letter));
            } else {
                snakeCase.append(letter);
            }
        }
        return snakeCase.toString();
    } 
    
    // 7 задача
    public static int secondBiggest(int[] numbersSeven){
        Arrays.sort(numbersSeven);
        return numbersSeven[numbersSeven.length-2];
    }

    // 8 задача
    public static String localReverse(String str, char marker) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean flag = false;
        for (char letterEight : str.toCharArray()) {
            if (letterEight == marker) {
                if (flag) {
                    result.append(temp.reverse());
                    result.append(marker);
                    temp.setLength(0);
                } else {
                    result.append(marker);
                }
                flag = !flag;
            } else {
                if (flag) {
                    temp.append(letterEight);
                } else {
                }
            }
        }
        result.append(temp.reverse());
        return result.toString();
    }

    // 9 задача
    public static int equal(int a, int b, int c){
        if (a == b && a == c) {
            return 3;
        }
        else if (a == b || b == c || a == c) {
            return 2;
        }
        else{
            return 0;
        }
    }

    // 10 задача
    public static boolean isAnagram(String firstWord, String secondWord){
        char[] cleanFirstWord = firstWord.replaceAll("[\\p{Punct}]", "").toLowerCase().toCharArray();
        char[] cleanSecondWord = secondWord.replaceAll("[\\p{Punct}]", "").toLowerCase().toCharArray();
        Arrays.sort(cleanFirstWord);
        Arrays.sort(cleanSecondWord);
        return Arrays.equals(cleanFirstWord, cleanSecondWord);
    }
}
