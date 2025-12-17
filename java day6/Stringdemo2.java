  public class Stringdemo2 {
    public static void main(String[] args) {
        // StringBuffer example
        StringBuffer sb = new StringBuffer("Hello");

        // StringBuilder example
        StringBuilder sb1 = new StringBuilder("World");
        sb1.append("hello");
        System.out.println(sb1);

        // Convert StringBuilder to String
        String s1 = new String(sb1);
        System.out.println(sb1.toString());

        // Insert into StringBuilder
        StringBuilder sb2 = new StringBuilder("welcome");
        sb2.insert(0, "hello");
        System.out.println(sb2);

        // Reverse, delete, replace operations
        StringBuilder sb3 = new StringBuilder("hello");
        System.out.println(sb3.reverse());
        System.out.println(sb3.deleteCharAt(0));
        System.out.println(sb3.replace(0, 4, "hello"));

        // HashCode of StringBuilder object
        System.out.println(sb3.hashCode());
    }
}