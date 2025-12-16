public class Missingnumbetr {
    public static void main(String[] args) {
        int a[] = {10,20,40,50};
        int n = a.length + 10; 
        int total = n * (n + 1) / 2; 
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        int missingNumber = total - sum;
        System.out.println("The missing number is: " + missingNumber);
    }
    
}
