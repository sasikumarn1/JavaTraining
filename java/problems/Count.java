public  class Count {
    public static void main(String[] args) {
        int number = 28; // You can change this number to test with other values
        System.out.println("Divisors of " + number + ":");
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
} 
    

