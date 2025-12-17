public class Stringdemo1 {
    
    public static void main(String[] args) {
        String str1 = "Good Morning!";
        String str2 = "Python Programming";

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Character at a specific index
        System.out.println("Character at index 5 in str1: " + str1.charAt(5));

        // Substring
        System.out.println("Substring of str2 from index 0 to 6: " + str2.substring(0, 6));

        // Concatenation
        String str3 = str1.concat(" Welcome to ").concat(str2);
        System.out.println("Concatenated String: " + str3);

        // Replace
        String str4 = str1.replace("Morning", "Evening");
        System.out.println("Replaced String: " + str4);

        // Convert to uppercase
        System.out.println("str2 in uppercase: " + str2.toUpperCase());

        // Convert to lowercase
        System.out.println("str1 in lowercase: " + str1.toLowerCase());

        // Trim whitespace
        String str5 = "   Hello Python!   ";
        System.out.println("Trimmed String: '" + str5.trim() + "'");
    }
}
        