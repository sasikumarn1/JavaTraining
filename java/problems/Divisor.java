public class Divisor {
    
    // Method to find all divisors of a number
    public static void findDivisors(int number) {
        System.out.println("Divisors of " + number + " are:");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    // Method to find and count all divisors
    public static int countDivisors(int number) {
        int count = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    // Optimized method to find divisors (up to sqrt(n))
    public static void findDivisorsOptimized(int number) {
        System.out.println("Divisors of " + number + " are:");
        
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                
                // Print the paired divisor if it's different
                if (i != number / i) {
                    System.out.print(number / i + " ");
                }
            }
        }
        System.out.println();
    }
    
    // Main method to test the program
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 28;
        int num3 = 36;
        
        findDivisors(num1);
        System.out.println("Total divisors: " + countDivisors(num1) + "\n");
        
        findDivisors(num2);
        System.out.println("Total divisors: " + countDivisors(num2) + "\n");
        
        findDivisorsOptimized(num3);
        System.out.println("Total divisors: " + countDivisors(num3));
    }
}
