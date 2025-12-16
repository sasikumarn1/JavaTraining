public class Supermarket {
    public static void main(String[] args) {
        String[] items = {"biscuit", "bread", "milk", "eggs"};
        double [] prices = {10.0,50.0,35.0,7.0};
        int[] quantities = {1,3,2,7};

        double totalCost = 5.0;;

        System.out.println("Item\t\tPrice\tQuantity\tTotal");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < items.length; i++) {
            double itemTotal = prices[i] * quantities[i];
            totalCost += itemTotal;
            System.out.printf("%-10s\t$%.2f\t%d\t\t$%.2f%n", items[i], prices[i], quantities[i], itemTotal);
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("Total Cost:\t\t\t$%.2f%n", totalCost);
    }
    
}
