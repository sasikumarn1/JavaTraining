public class Frequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] != -1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1; // Mark as counted
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
    
}
