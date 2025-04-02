package Day2;

public class ReverseWords {

    public static String reverseWords(String sentence) {

        // \\s matches any whitespace character (space, tab, newline, etc.).
        // + ensures that one or more consecutive whitespace characters are treated as a single delimiter.
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length-1 ; i >= 0; i--){
            result = result.append(words[i]).append(" ");
        }

        return result.toString();
    }

    // Main method
    public static void main(String[] args) {
        String input = "SDET interviews are    tricky";
        System.out.println("Reversed sentence: " + reverseWords(input));
    }
}

// Approach 2
/*

public static String reverseWords(String sentence) {
    String[] strAray = sentence.split(" ");
    String result = "";

    for (int i = strAray.length - 1; i >= 0; i--) {
        result = result + strAray[i] + " ";
    }
    return result;
}

public static void main(String[] args) {

    String input = "SDET interviews are tricky";
    System.out.println("Reversed sentence: " + reverseWords(input));

}

*/
