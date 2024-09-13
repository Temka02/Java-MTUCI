public class firstTask {
    public static void main(String[] args) {
        // 1 задача
        System.out.println("1 point--------------------------------------");
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
        // 2 задача
        System.out.println("2 point--------------------------------------");
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
        // 3 задача
        System.out.println("3 point--------------------------------------");
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
        // 4 задача
        System.out.println("4 point--------------------------------------");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
        // 5 задача
        System.out.println("5 point--------------------------------------");
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        // 6 задача
        System.out.println("6 point--------------------------------------");
        System.out.println(howManyItems(22, 1.4, 2));
        System.out.println(howManyItems(45, 1.8, 1.9));
        System.out.println(howManyItems(100, 2, 2));
        // 7 задача
        System.out.println("7 point--------------------------------------");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        // 8 задача
        System.out.println("8 point--------------------------------------");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        // 9 задача
        System.out.println("9 point--------------------------------------");
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
        // 10 задача
        System.out.println("10 point--------------------------------------");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
    // 1 задача
    public static double convert(int x) {
        return 3.785 * x;
    }

    // 2 задача
    public static int fitCalc(int x, int y) {
        return x*y;
    }
    
    // 3 задача
    public static int containers(int x, int y, int z) {
        return 20*x + 50*y + 100*z;
    }

    // 4 задача
    public static String triangleType(int a, int b, int c) {
        if (( a+b <= c) || ( a+c <= b) || ( b+c <= a)){
            return "not a triangle";
        }
        if ((a == b) && (b == c)) {
            return "isosceles";
        }
        if ((a == b) || (a == c) || (b == c)){
            return "equilateral";
        }
        return "different-sided";
    }
    
    // 5 задача
    public static int ternaryEvaluation(int a, int b){
        int maxNum = (a > b) ?  a : b;
        return maxNum;
    }
    
    // 6 задача
    public static int howManyItems(int a, double b, double c){
        int numOfItems = (int)(a / (b * c * 2));
        return numOfItems;
    } 
    
    // 7 задача
    public static int factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result = i * result;
        }
        return result;
    }

    // 8 задача
    public static int gcd(int a, int b){
        while ((a != 0) && (b != 0)){
            if (a>b) a = a % b;
            else b = b % a;
        }
        return a+b;
    }

    // 9 задача
    public static int ticketSaler(int a, int b){
        return (int) (a*(b-b*0.28));
    }

    // 10 задача
    public static int tables(int a, int b){
        if (a < b*2) return 0;
        else{
            if (a%2 != 0) return (int)((a - b*2)/2 + 1);
            else return (int)((a - b*2)/2);
        }
    } 

}