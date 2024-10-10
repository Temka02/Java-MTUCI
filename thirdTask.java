import java.util.Arrays;

public class thirdTask {
    public static void main(String[] args){
        // 1 задача
        System.out.println("------------------------------------1 point--------------------------------------");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));


        // 2 задача
        System.out.println("------------------------------------2 point--------------------------------------");
        Object[][] products = new Object[][] {
            {"Laptop", 124200},
            {"Phone", 51450},
            {"Headphones", 13800},
        };
        Object[][] result = sale(products, 25);
        for (Object[] product : result) {
            System.out.println(Arrays.toString(product));
        }


        // 3 задача
        System.out.println("------------------------------------3 point--------------------------------------");
        System.out.println(sucsessShoot(0, 0, 5, 2, 2));
        System.out.println(sucsessShoot(-2, -3, 4, 5, -6));

        // 4 задача
        System.out.println("------------------------------------4 point--------------------------------------");
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));

        
        // 5 задача
        System.out.println("------------------------------------5 point--------------------------------------");
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));

        // 6 задача
        System.out.println("------------------------------------6 point--------------------------------------");
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));
        // 7 задача
        System.out.println("------------------------------------7 point--------------------------------------");
        Object[][] inventory = new Object[][] {
            {"Скакалка", 550, 8},
            {"Шлем", 3750, 4},
            {"Мяч", 2900, 10}
          };
        System.out.println(mostExpensive(inventory)); 

        // 8 задача
        System.out.println("------------------------------------8 point--------------------------------------");
        System.out.println(longestUnique("abcba"));
        System.out.println(longestUnique("bbb"));
        // 9 задача
        System.out.println("------------------------------------9 point--------------------------------------");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));

        // 10 задача
        System.out.println("------------------------------------10 point--------------------------------------");
        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));

    }
    // 1 задача
    public static boolean isStrangePair(String x, String y) {
        char[] charX = x.toCharArray();
        char[] charY = y.toCharArray();
        if (charX.length == 0 || charY.length == 0) {
            if (charX.length == charY.length) {
                return true;
            }
            return false;
        }
        if (charX[0] == charY[charY.length-1]){
            if (charX[charX.length-1] == charY[0]){
                return true;
            }
        }
        return false;
    }

    // 2 задача
    public static Object[][] sale(Object[][] products, int discount) {
        Object[][] result = new Object[products.length][2];
        for (int i = 0; i < products.length; i++) {
            Object[] product = products[i];
            String name = (String) product[0];
            int price = (int) product[1]; 
            double discountedPrice = price - (price * discount / 100.0); 
            discountedPrice = Math.max(1, Math.round(discountedPrice));
            result[i] = new Object[] {name, (int) discountedPrice};
        }
        return result;
    }
    // 3 задача
    public static boolean sucsessShoot(int x, int y, int r, int m, int n) {
        int distanceSquared = (m - x) * (m - x) + (n - y) * (n - y);
        int radiusSquared = r * r;
        return distanceSquared <= radiusSquared;
    }

    // 4 задача
    public static boolean parityAnalysis(int x) {
        int sum = 0;
        int curX = x;
        while (curX > 0) {
            sum += curX % 10; // Добавляем последнюю цифру
            curX /= 10; // Удаляем последнюю цифру
        }
        return (x % 2 == sum % 2);
    }
    
    // 5 задача
    public static String rps(String x, String y){
        if (x == y) {
            return "Tie";
        }
        if (x == "rock"){
            if (y == "paper"){
                return "Player 2 wins";
            }
            else{
                return "Player 1 wins";
            }
        }
        if (x == "paper"){
            if (y == "scissors"){
                return "Player 2 wins";
            }
            else{
                return "Player 1 wins";
            }
        }
        if (x == "scissors"){
            if (y == "rock"){
                return "Player 2 wins";
            }
            else{
                return "Player 1 wins";
            }
        }
        return "invalid input";
    }
    
    // 6 задача
    public static int bugger(int x) {
        if (x < 10) return 0; // Если число однозначное, возвращаем 0

        int count = 0;

        while (x >= 10) {
            int product = 1;
            while (x > 0) {
                product *= x % 10; 
                x /= 10; 
            }
            x = product;
            count++;
        }

        return count;
    }
    
    // 7 задача
    public static String mostExpensive(Object[][] inventory) {
        int maxTotalCost = 0;
        String mostExpensiveItem = "";
        for (Object[] item : inventory) {
            int cost = (int) item[1];
            int quantity = (int) item[2];
            int totalCost = cost * quantity;
            if (totalCost > maxTotalCost) {
                maxTotalCost = totalCost;
                mostExpensiveItem = (String) item[0];
            }
        }
        return "Наиб. общ. стоимость у предмета " + mostExpensiveItem + " - " + maxTotalCost;
    }

    // 8 задача
    public static String longestUnique(String str) {
        String longestStr = "";
        String currentStr = ""; 
        for (char letter : str.toCharArray()) {
            if (currentStr.contains(String.valueOf(letter))) {
                // Если символ уже есть, обновляем текущую подстроку
                currentStr = currentStr.substring(currentStr.indexOf(letter) + 1);
            }
            currentStr += letter; // Добавляем текущий символ
            if (currentStr.length() > longestStr.length()) {
                longestStr = currentStr; // Обновляем самую длинную уникальную подстроку
            }
        }
        return longestStr;
    }

    // 9 задача
    public static boolean isPrefix(String x, String y){
        String clearPrefix = y.substring(0, y.length()-1);
        String clearXP = x.substring(0, y.length()-1);
        return clearPrefix.equals(clearXP);
    }

    public static boolean isSuffix(String x, String y){
        String clearSuffix = y.substring(1); //phobia
        String clearXS = x.substring(x.length() - y.length() + 1);
        return clearSuffix.equals(clearXS);
    }

    // 10 задача
    public static boolean doesBrickFit(int a, int b, int c, int w, int h){
        if ((a <= w && b <= h) || (a <= h && b <= w) || (a <= w && c <= h) || (a <= h && c <= w) ||(b <= w && c <= h) || (b <= h && c <= w)){
            return true;
        }
        return false;
    }
}
